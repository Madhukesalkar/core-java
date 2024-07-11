class RemoteRunner{
	
	static boolean connect;
	public static void main(String[] jbl){
	
	System.out.println("main started");
	
	connect = Remote.onOrOff();
	System.out.println("is Remote connected :"+connect);
	    Remote.increaseVolume();
		Remote.increaseVolume();
		Remote.increaseVolume();
		Remote.increaseVolume();
		Remote.increaseVolume();
		Remote.increaseVolume();
		Remote.increaseVolume();
		Remote.increaseVolume();
			
		Remote.decreaseVolume();
		Remote.decreaseVolume();
		Remote.decreaseVolume();
		Remote.decreaseVolume();
		Remote.decreaseVolume();
		Remote.decreaseVolume();
		Remote.decreaseVolume();
		Remote.decreaseVolume();
		Remote.decreaseVolume();
	
System.out.println("main ended");	
	}
}