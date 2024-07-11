class TelevisionRunner{
 public static void main(String[]jbl){
  System.out.println("Main started");
	
    boolean connect = Television.onOrOff();
	System.out.println("is Television is connected : " + connect);
	
	connect =  Television.onOrOff();
	System.out.println("is Television is connected : " + connect);
	
    System.out.println("Main Ended");

 } 
}
