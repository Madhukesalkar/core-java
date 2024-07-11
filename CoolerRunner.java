class CoolerRunner{
	
	static boolean connect;
	public static void main(String[] lg){
	
	System.out.println("main started");
	
	connect = Cooler.onOrOff();
	System.out.println("is Cooler connected :"+connect);
	Heater.increaseTemprature();
	
	connect = Cooler.onOrOff();
	System.out.println("is Cooler connected :"+connect);
	Cooler.increaseTemprature();
	Cooler.decreaseTemprature();
    connect = Cooler.onOrOff();
		Cooler.increaseTemprature();
		Cooler.increaseTemprature();
		Cooler.increaseTemprature();
		Cooler.increaseTemprature();
		Cooler.increaseTemprature();
		Cooler.increaseTemprature();
		Cooler.increaseTemprature();
			
		Cooler.decreaseTemprature();
		Cooler.decreaseTemprature();
		Cooler.decreaseTemprature();
		Cooler.decreaseTemprature();
		Cooler.decreaseTemprature();
		Cooler.decreaseTemprature();
		Cooler.decreaseTemprature();
		Cooler.decreaseTemprature();
		Cooler.decreaseTemprature();
	System.out.println("is Cooler connected :"+connect);
		connect = Cooler.onOrOff();
	System.out.println("is Cooler connected :"+connect);
	
System.out.println("main ended");	
	}
}