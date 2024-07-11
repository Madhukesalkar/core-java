class TelevisionRunner{
	
	static boolean connect;
	public static void main(String[] jbl){
	
	System.out.println("main started");
	
	connect = Television.onOrOff();
	System.out.println("is Television connected :"+connect);
	    Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
		Television.increaseVolume();
			
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
		Television.decreaseVolume();
	
System.out.println("main ended");	
	}
}