class HeaterRunner{
	
	static boolean connect;
	public static void main(String[] lg){
	
	System.out.println("main started");
	
	connect = Heater.onOrOff();
	System.out.println("is Heater connected :"+connect);
	Heater.increaseTemprature();
	
	connect = Heater.onOrOff();
	System.out.println("is heater connected :"+connect);
	Heater.increaseTemprature();
	Heater.decreaseTemprature();
    connect = Heater.onOrOff();
		Heater.increaseTemprature();
		Heater.increaseTemprature();
		Heater.increaseTemprature();
		Heater.increaseTemprature();
		Heater.increaseTemprature();
		Heater.increaseTemprature();
		Heater.increaseTemprature();
			
		Heater.decreaseTemprature();
		Heater.decreaseTemprature();
		Heater.decreaseTemprature();
		Heater.decreaseTemprature();
		Heater.decreaseTemprature();
		Heater.decreaseTemprature();
		Heater.decreaseTemprature();
		Heater.decreaseTemprature();
		Heater.decreaseTemprature();
	System.out.println("is heater connected :"+connect);
		connect = Heater.onOrOff();
	System.out.println("is heater connected :"+connect);
	
System.out.println("main ended");	
	}
}