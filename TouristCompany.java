import java.util.Arrays;


class TouristCompany{

  static String placeNames[]= {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addplaceName(String placeName){
 
 boolean isTouristplaceAdded = false;
 
  if(index<placeNames.length){
  if(placeName!=null){
  placeNames[index++]=placeName;
  isTouristplaceAdded=true;
  }
  else
  System.out.println("place Name is invalid");
  }
  else
   System.out.println("sorry...placeName is full");
   
   return isTouristplaceAdded;
  }
  
  
  public static void showTouristplaceList(){
  System.out.println("main started");
  
  for(String placeName:placeNames)
  System.out.println(placeName);
  
  System.out.println("main started");
  
  }
   public static boolean updatePlaceName(String newPlaceName,String oldPlaceName){
	  System.out.println("update place Name stated");
	 boolean isPlaceNameUpdated=false;
	  for(int position=0;position<placeNames.length;position++ ){
		  if(placeNames[position]==oldPlaceName){
			  placeNames[position]=newPlaceName;
			  isPlaceNameUpdated = true; 
		  }
  }
	      if(isPlaceNameUpdated==false)
		  System.out.println(oldPlaceName +"not found");
	 
	 System.out.println("update place Name ended");
	 return isPlaceNameUpdated;
  }
  
  public static boolean deletePlaceName(String placeName){
	  
	  boolean isPlaceNameDeleted = false;
	  int position,newPosition;
	  for(position=0,newPosition=0;position<placeNames.length;position++){
		  if(placeNames[position]!= placeName){
			  placeNames[newPosition] = placeNames[position];
               newPosition++;
		  }
		  else 
			  isPlaceNameDeleted= true;
	  }
	  int newLength= newPosition;
	  placeNames =Arrays.copyOf(placeNames,newLength);
	  
	  if(isPlaceNameDeleted==false){
		  System.out.println(placeName +"not found");
		  
		   }
		return isPlaceNameDeleted;  
  }
}

