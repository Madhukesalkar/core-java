class CameraRunner{
 public static void main(String[]jbl){
  System.out.println("Main started");
	
    boolean connect = Camera.onOrOff();
	System.out.println("is Camera is connected : " + connect);
	
	connect =  Camera.onOrOff();
	System.out.println("is Camera is connected : " + connect);
	
    System.out.println("Main Ended");

 } 
}