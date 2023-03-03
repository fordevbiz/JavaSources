public class LuhnAlgorithm{

	public static boolean isValid(String payload){

		int tmp = 0;
		StringBuilder strb = new StringBuilder(payload);
		int checkDigit = Integer.parseInt(strb.charAt(strb.length()-1)+"");

		//Remove the last digit if the payload included the check		
		strb = strb.deleteCharAt(strb.length()-1);

		//	With the payload, start from the rightmost digit.
		for (int i = strb.length()-1; i >= 0; i-=2) {

			//	Moving left, double the value of every second digit (including the rightmost digit).
			tmp = 2*(Integer.parseInt(strb.charAt(i)+"")); 

			//	Sum the digits of the resulting value in each position
			tmp = (tmp >= 10) ? ((tmp % 10) + 1) : tmp;

			//	Set the new values to the payload
			strb.setCharAt(i,(char)(tmp + '0'));
		}

		tmp = 0;
		
		for (int j = 0; j < strb.length(); j++) {
			tmp += Integer.parseInt(strb.charAt(j)+"");
		}

		// ((10 - (s % 10)) % 10)
		return (((10 - (tmp % 10)) % 10) == checkDigit);
	}

	public static void main(String[] args) {

		System.out.println(isValid("9568054677375513"));
		System.out.println(isValid("9568054677375514"));
	}
}
// NIB_DUKEMEI_MKR1
// https://en.wikipedia.org/wiki/Luhn_algorithm
// https://simplycalc.com/luhn-calculate.php
/*
	function isValid(cardNumber[1..length])
	    sum := 0
	    parity := length mod 2
	    for i from 1 to length do
	        if i mod 2 != parity then
	            sum := sum + cardNumber[i]
	        elseif cardNumber[i] > 4 then
	            sum := sum + 2 * cardNumber[i] - 9
	        else
	            sum := sum + 2 * cardNumber[i]
	        end if
	    end for
	    return sum mod 10 = 0
	end function

*/