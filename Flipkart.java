import java.util.Arrays;

class Flipkart{

  static String itemNames[]= {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addItemName(String itemName){
 
 boolean isItemAdded = false;
 
  if(index<itemNames.length){
  if(itemName!=null){
  itemNames[index++]=itemName;
  isItemAdded=true;
  }
  else
  System.out.println("item Name is invalid");
  }
  else
   System.out.println("sorry...itemName is full");
   
   return isItemAdded;
  }
  
  public static void showItemList(){
  System.out.println("main started");
  
  for(String itemName:itemNames)
  System.out.println(itemName);
  
  System.out.println("main started");
  
  }
  
  public static boolean updateItemName(String newItemName,String oldItemName){
	  System.out.println("update itemName stated");
	 boolean isItemNameUpdated=false;
	  for(int position=0;position<itemNames.length;position++ ){
		  if(itemNames[position]==oldItemName){
			  itemNames[position]=newItemName;
			  isItemNameUpdated = true; 
		  }
  }
	      if(isItemNameUpdated==false)
		  System.out.println(oldItemName +"not found");
	 
	 System.out.println("update itemName ended");
	 return isItemNameUpdated;
  }
  
  public static boolean deleteItemName(String itemName){
	  
	  boolean isItemNameDeleted = false;
	  int position,newPosition;
	  for(position=0,newPosition=0;position<itemNames.length;position++){
		  if(itemNames[position]!= itemName){
			  itemNames[newPosition] = itemNames[position];
               newPosition++;
		  }
		  else 
			  isItemNameDeleted= true;
	  }
	  int newLength= newPosition;
	  itemNames =Arrays.copyOf(itemNames,newLength);
	  
	  if(isItemNameDeleted==false){
		  System.out.println(itemName +"not found");
		  
	  }
		return isItemNameDeleted;  
  }
}