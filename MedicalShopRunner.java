class MedicalShopRunner{

  public static void main(String [] medicine){
  
  boolean isMedicineAdded = MedicalShop .addMedicineName("Acetaminophen.");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Adderall");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Amitriptyline");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Amlodipine");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Amoxicillin");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Ativan");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Atorvastatin");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("Azithromycin");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("hydrochlorothiazide");
  System.out.println("is medicine added "+isMedicineAdded);
  
  isMedicineAdded = MedicalShop .addMedicineName("cephalexin");
  System.out.println("is medicine added "+isMedicineAdded);
 
  MedicalShop.showMedicineList();
  
  boolean medicineUpdated = MedicalShop .updateMedicineName("dolo 650","Adderall");
  System.out.println("is medicine updated "+medicineUpdated);
 
  MedicalShop.showMedicineList();
  
  boolean medicineDeleted = MedicalShop .deleteMedicineName("Amoxicillin");
  System.out.println("is medicine deleted "+medicineDeleted);
 
  MedicalShop.showMedicineList();
  }

}