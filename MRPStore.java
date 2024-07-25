import java.util.Arrays;


class MRPStore{

  static String alcoholNames[]= {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addalcoholName(String alcoholName){
 
 boolean isAlcoholNameAdded = false;
 
  if(index<alcoholNames.length){
	  //validation
  if(alcoholName!=null){
  alcoholNames[index++]=alcoholName;
  isAlcoholNameAdded=true;
  }
  else
  System.out.println("alcohol Name is invalid");
  }
  else
   System.out.println("sorry...alcohol Name is full");
   
   return isAlcoholNameAdded;
  }
  
  public static void showAlcoholNameList(){
  System.out.println("main started");
  
  for(String alcoholName:alcoholNames)
  System.out.println(alcoholName);
  
  System.out.println("main started");
  
  }
   public static boolean updateAlcoholName(String newAlcoholName,String oldAlcoholName){
	  System.out.println("update alcohol Name stated");
	 boolean isAlcoholNameUpdated=false;
	  for(int position=0;position<alcoholNames.length;position++ ){
		  if(alcoholNames[position]==oldAlcoholName){
			  alcoholNames[position]=newAlcoholName;
			  isAlcoholNameUpdated = true; 
		  }
  }
	      if(isAlcoholNameUpdated==false)
		  System.out.println(oldAlcoholName +"not found");
	 
	 System.out.println("update alcohol Name ended");
	 return isAlcoholNameUpdated;
  }
  
  public static boolean deleteAlcoholName(String alcoholName){
	  
	  boolean isAlcoholNameDeleted = false;
	  int position,newPosition;
	  for(position=0,newPosition=0;position<alcoholNames.length;position++){
		  if(alcoholNames[position]!= alcoholName){
			  alcoholNames[newPosition] = alcoholNames[position];
               newPosition++;
		  }
		  else 
			  isAlcoholNameDeleted= true;
	  }
	  int newLength= newPosition;
	  alcoholNames =Arrays.copyOf(alcoholNames,newLength);
	  
	  if(isAlcoholNameDeleted==false){
		  System.out.println(alcoholName +"not found");
		  
		   }
		return isAlcoholNameDeleted;  
  }
}