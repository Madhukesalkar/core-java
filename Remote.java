class Remote{

	static boolean isConnected 	= false;
	static int     maxVolume   	= 100;
	static int    currentVolume = 0;
	static int     minVolume    = 0;
	 
	public static boolean onOrOff(){
	
	if(!isConnected) isConnected=true;
		//System.out.println("Remote has turned on..");
	
	
	else  isConnected=false;
		//System.out.println("Remote has turned off..");
	
	
	return isConnected;
	} 
	
	public static void increaseVolume(){
		System.out.println("increaseVolume started");
		if(isConnected){
			if(currentVolume<maxVolume){
				currentVolume++;
				System.out.println("current volume is "+currentVolume);
			}
			else{
				System.out.println("max volume reached");
			}
		}
		else{
			System.out.println("please turn on the Remote");
		}
		System.out.println("increaseVolume ended");
	return ;	
	}
	
	public static void decreaseVolume(){
		System.out.println("decreaseVolume started");
		if(isConnected){
			if(currentVolume>minVolume){
				currentVolume--;
				System.out.println("current volume is "+currentVolume);
			}
			else{
				System.out.println("min volume reached");
			}
		}
		else{
			System.out.println("please turn on the Remote");
		}
		System.out.println("decreaseVolume ended");
	return ;	
	}
}



