import java.util.Arrays;
class MedicalShop{

  static String medicineNames[]= {null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addMedicineName(String medicineName){
 
 boolean isMedicineAdded = false;
 
  if(index<medicineNames.length){
  if(medicineName!=null){
  medicineNames[index++]=medicineName;
  isMedicineAdded=true;
  }
  else
  System.out.println("medicine Name is invalid");
  }
  else
   System.out.println("sorry...medicine Name is full");
   
   return isMedicineAdded;
  }
  
  public static void showMedicineList(){
  System.out.println("main started");
  
  for(String medicineName:medicineNames)
  System.out.println(medicineName);
  
  System.out.println("main started");
  
  }
   public static boolean updateMedicineName(String newMedicineName,String oldMedicineName){
	  System.out.println("update medicineName stated");
	 boolean isMedicineNameUpdated=false;
	  for(int position=0;position<medicineNames.length;position++ ){
		  if(medicineNames[position]==oldMedicineName){
			  medicineNames[position]=newMedicineName;
			  isMedicineNameUpdated = true; 
		  }
  }
	      if(isMedicineNameUpdated==false)
		  System.out.println(oldMedicineName +"not found");
	 
	 System.out.println("update Medicine Name ended");
	 return isMedicineNameUpdated;
  }
  
  public static boolean deleteMedicineName(String medicineName){
	  
	  boolean isMedicineNameDeleted = false;
	  int position,newPosition;
	  for(position=0,newPosition=0;position<medicineNames.length;position++){
		  if(medicineNames[position]!= medicineName){
			  medicineNames[newPosition] = medicineNames[position];
               newPosition++;
		  }
		  else 
			  isMedicineNameDeleted= true;
	  }
	  int newLength= newPosition;
	  medicineNames =Arrays.copyOf(medicineNames,newLength);
	  
	  if(isMedicineNameDeleted==false){
		  System.out.println(medicineName +"not found");
		  
	  }
		return isMedicineNameDeleted;  
  }
}