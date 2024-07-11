class RedBus{
public static void main(String bus[]){


    String headQuarters = "Bengluru";
    int dateFounded = 2006;
	String busNames[] = {"Volvo" , "Airavat" , "Rajhamsa" , "SRS" , "VRL" , "Sea bird" , "Sugama" , "Guru Shakti"};
  


   System.out.println("About RedBus: ");
   System.out.println("HeadQuarters Located @ " + headQuarters );   
   System.out.println("Date Founded " + dateFounded );
   System.out.println("No of Buses Available in RedBus " + busNames.length );
   System.out.println("List of Buses Available for the Transport are: ");
   
   
   // System.out.println(busNames);
   
   
   for( int ref = 0 ; ref < busNames.length ; ref++ ){
       String value = busNames[ref] ;
	   System.out.println(value);
   }
   System.out.println("Main ended");






}
}