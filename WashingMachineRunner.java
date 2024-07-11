class WashingMachineRunner{
 public static void main(String[]jbl){
  System.out.println("Main started");
	
    boolean connect = WashingMachine.onOrOff();
	System.out.println("is WashingMachine is connected : " + connect);
	
	connect =  WashingMachine.onOrOff();
	System.out.println("is WashingMachine is connected : " + connect);
	
    System.out.println("Main Ended");

 } 
}
