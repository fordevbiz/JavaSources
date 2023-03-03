https://www.epochconverter.com/

```java

	long epoch = System.currentTimeMillis()/1000; 
	//Returns epoch in seconds.

```

```java

	long epoch = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse("01/01/197001:00:00").getTime() / 1000; 
	//Timestamp in seconds, remove '/1000' for milliseconds.

```

```java

	String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (epoch * 1000));
	//Epoch in seconds, remove '*1000' for milliseconds.

```