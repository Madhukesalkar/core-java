class WashingMachine{

	static boolean isConnected 	= false;
	static int     maxSpeed   	= 90;
	static int    currentSpeed = 50;
	static int     minSpeed   = 0;
	 
	public static boolean onOrOff(){
	
	if(!isConnected) isConnected=true;
		//System.out.println("WashingMachine has turned on..");
	
	
	else  isConnected=false;
		//System.out.println("washingmachine has turned off..");
	
	
	return isConnected;
	} 
	
	public static void increaseSpeed(){
		System.out.println("increaseSpeed started");
		if(isConnected){
			if(currentSpeed<maxSpeed){
				currentSpeed++;
				System.out.println("current Speed is "+currentSpeed);
			}
			else{
				System.out.println("max Speed reached");
			}
		}
		else{
			System.out.println("please turn on the washingmachine");
		}
		System.out.println("increaseSpeed ended");
	return ;	
	}
	
	public static void decreaseSpeed(){
		System.out.println("decreaseSpeed started");
		if(isConnected){
			if(currentSpeed>minSpeed){
				currentSpeed--;
				System.out.println("current Speed is "+currentSpeed);
			}
			else{
				System.out.println("min Speed reached");
			}
		}
		else{
			System.out.println("please turn on the washingmachine");
		}
		System.out.println("decreaseSpeed ended");
	return ;	
	}
}



