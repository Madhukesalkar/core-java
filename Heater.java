class Heater{

	static boolean isConnected 	= false;
	static int     maxTemprature   	= 90;
	static int    currentTemprature = 50;
	static int     minTemprature   = 0;
	 
	public static boolean onOrOff(){
	
	if(!isConnected) isConnected=true;
		//System.out.println("Heater has turned on..");
	
	
	else  isConnected=false;
		//System.out.println("Heater has turned off..");
	
	
	return isConnected;
	} 
	
	public static void increaseTemprature(){
		System.out.println("increaseTemprature started");
		if(isConnected){
			if(currentTemprature<maxTemprature){
				currentTemprature++;
				System.out.println("current Temprature is "+currentTemprature);
			}
			else{
				System.out.println("max Temprature reached");
			}
		}
		else{
			System.out.println("please turn on the heater");
		}
		System.out.println("increaseTemprature ended");
	return ;	
	}
	
	public static void decreaseTemprature(){
		System.out.println("decreaseTemprature started");
		if(isConnected){
			if(currentTemprature>minTemprature){
				currentTemprature--;
				System.out.println("current Temprature is "+currentTemprature);
			}
			else{
				System.out.println("min Temprature reached");
			}
		}
		else{
			System.out.println("please turn on the heater");
		}
		System.out.println("decreaseTemprature ended");
	return ;	
	}
}



