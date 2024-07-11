class Camera{


 static boolean isConnected = false;
 
 public static boolean onOrOff(){
 System.out.println("Start of onOrOff");
 
  if(isConnected == false){
  isConnected = true;
  System.out.println("Camera is turned on....");
  
	 } else if(isConnected == true){
	 isConnected = false;
	 System.out.println("Camera is turned off...");
	 }
 System.out.println("end of onOrOff");
  return isConnected;
  }
}