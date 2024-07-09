class Speaker{


 static boolean isConnected = false;
 
 public static boolean onOrOff(){
 System.out.println("Start of onOrOff");
  if(isConnected == false){
  isConnected = true;
  System.out.println("Speaker is turned on....");
	 } else if(isConnected == true){
	 isConnected = false;
	 System.out.println("Speaker is turned off...");
	 }
 System.out.println("end of onOrOff");
  return isConnected;
  }
}
  
     /*public static void turnOff(){
	 System.out.println("start of turnOff");
	 if(isConnected == true){
	 isConnected = false;
	 System.out.println("Speaker is turned off...");
	 }
	System.out.println("end of turnOff...");
	
	 }
}*/