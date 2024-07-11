class RemoteRunner{
 public static void main(String[]jbl){
  System.out.println("Main started");
	
    boolean connect = Remote.onOrOff();
	System.out.println("is Remote is connected : " + connect);
	
	connect =  Remote.onOrOff();
	System.out.println("is Remote is connected : " + connect);
	
    System.out.println("Main Ended");

 } 
}