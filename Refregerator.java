class Refregerator{


 static boolean isConnected = false;
 
 public static void turnOn(){
 System.out.println("Start of turnOn");
  if(isConnected == false){
  isConnected = true;
  System.out.println("Refregerator is turned on....");
	 }
 System.out.println("end of turnOn");
 }
 
     public static void turnOff(){
	 System.out.println("start of turnOff");
	 if(isConnected == true){
	 isConnected = false;
	 System.out.println("Refregerator is turned off...");
	 }
	System.out.println("end of turnOff...");
	 }
}