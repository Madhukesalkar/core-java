class RefregeratorRunner{
	
	static boolean connect;
	public static void main(String[] lg){
	
	System.out.println("main started");
	
	connect = Refregerator.onOrOff();
	System.out.println("is Refregerator connected :"+connect);
	Heater.increaseTemprature();
	
	connect = Refregerator.onOrOff();
	System.out.println("is Refregerator connected :"+connect);
	Refregerator.increaseTemprature();
	Refregerator.decreaseTemprature();
    connect = Refregerator.onOrOff();
		Refregerator.increaseTemprature();
		Refregerator.increaseTemprature();
		Refregerator.increaseTemprature();
		Refregerator.increaseTemprature();
		Refregerator.increaseTemprature();
		Refregerator.increaseTemprature();
		Refregerator.increaseTemprature();
			
		Refregerator.decreaseTemprature();
		Refregerator.decreaseTemprature();
		Refregerator.decreaseTemprature();
		Refregerator.decreaseTemprature();
		Refregerator.decreaseTemprature();
		Refregerator.decreaseTemprature();
		Refregerator.decreaseTemprature();
		Refregerator.decreaseTemprature();
		Refregerator.decreaseTemprature();
	System.out.println("is Refregerator connected :"+connect);
		connect = Refregerator.onOrOff();
	System.out.println("is Refregerator connected :"+connect);
	
System.out.println("main ended");	
	}
}