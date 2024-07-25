import java.util.Arrays;

class JuiceShop{

   static String juiceNames[]={null,null,null,null,null,null};
   static int index;
   public static boolean addJuiceName(String juiceName){
   
   boolean isJuiceNameAdded = false;
   
   if(index<juiceNames.length){
   if(juiceName!=null){
   juiceNames[index++]=juiceName;
   isJuiceNameAdded=true;
   }
   else
   System.out.println("juice name is invalid");
   }
   else
   System.out.println("sorry.. juiceName is full");
   return isJuiceNameAdded;
   }
   public static void showJuiceName(){
   System.out.println("Main started");
   
   for(String juiceName:juiceNames)
   System.out.println(juiceName);
   System.out.println("Main ended");

   
   }
   public static boolean updateJuiceName(String newJuiceName,String oldJuiceName){
	  System.out.println("update juiceName stated");
	 boolean isJuiceNameUpdated=false;
	  for(int position=0;position<juiceNames.length;position++ ){
		  if(juiceNames[position]==oldJuiceName){
			  juiceNames[position]=newJuiceName;
			  isJuiceNameUpdated = true; 
		  }
  }
	      if(isJuiceNameUpdated==false)
		  System.out.println(oldJuiceName +"not found");
	 
	 System.out.println("update juiceName ended");
	 return isJuiceNameUpdated;
  }
  
  public static boolean deleteJuiceName(String juiceName){
	  
	  boolean isJuiceNameDeleted = false;
	  int position,newPosition;
	  for(position=0,newPosition=0;position<juiceNames.length;position++){
		  if(juiceNames[position]!= juiceName){
			  juiceNames[newPosition] = juiceNames[position];
               newPosition++;
		  }
		  else 
			  isJuiceNameDeleted= true;
	  }
	  int newLength= newPosition;
	  juiceNames =Arrays.copyOf(juiceNames,newLength);
	  
	  if(isJuiceNameDeleted==false){
		  System.out.println(juiceName +"not found");
		  
	  }
		return isJuiceNameDeleted;  
  }
   
}