class SpeakerRunner{
	
	static boolean connect;
	public static void main(String[] jbl){
	
	System.out.println("main started");
	
	connect = Speaker.onOrOff();
	System.out.println("is speaker connected :"+connect);
	    Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
			
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
	
System.out.println("main ended");	
	}
}