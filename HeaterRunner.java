class HeaterRunner{
 public static void main(String[]jbl){
  System.out.println("Main started");
	
    boolean connect = Heater.onOrOff();
	System.out.println("is Heater is connected : " + connect);
	
	connect =  Heater.onOrOff();
	System.out.println("is Heater is connected : " + connect);
	
    System.out.println("Main Ended");

 } 
}