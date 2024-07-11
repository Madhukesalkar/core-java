class Speaker{


 static boolean isConnected = false;
 static int      maxVolume = 7;
 static int     currentVolume = 
 
    public static boolean onOrOff(){
         System.out.println("Start of onOrOff");
    if(!isConnected) 
		isConnected = true;
    else if(isConnected) 
		isConnected = false;
	 
	 
         System.out.println("end of onOrOff");
     return isConnected;
  }
  // increase volume
  public static void increaseVolume(){
	  System.out.println("increaseVolume started")
	  if(isConnected == true){
		  currentVolume <= maxVolume){
		  currentVolume = currentVolume+1;
		  System.out.println("The current Volume is " + currentVolume);
		  }
		  
	  }else{
		  System.out.println("")
	  }
	  System.out.println("increaseVolume ended");
  }
}