import java.io.File;
import java.lang.*;

public class FileWriter{

	public static void main(String[] args) {

		File f = new File("Test.txt");

		System.out.println(f.getName());

	}

	public FileWriter(File f){

		this.f = f
	}

/*
StringUtils.leftPad(str, L, ch);
StringUtils.center(str, L, ch);
StringUtils.rightPad(str, L, ch);
*/

	public boolean writeOnFile(String data, int padding, int length, String separator){


	}
}