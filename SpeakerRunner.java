class SpeakerRunner{
 public static void main(String[]jbl){
  System.out.println("Main started");
	
    boolean connect = Speaker.onOrOff();
	System.out.println("is speaker is connected : " + connect);
	
	connect =  Speaker.onOrOff();
	System.out.println("is speaker is connected : " + connect);
	
    System.out.println("Main Ended");

 } 
}
