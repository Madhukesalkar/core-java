class TouristCompanyRunner{

  public static void main(String [] place){
  
  boolean isPlaceAdded = TouristCompany.addplaceName("gol gumbaj");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("gokak falls");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("tillari falls");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("cubbon park");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("iskon temple");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("Amboli falls");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("nandi hill");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("sirsi temple");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("kodagu");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("hampi");
  System.out.println("is place added "+isPlaceAdded);
  
  isPlaceAdded = TouristCompany.addplaceName("murdeshwar");
  System.out.println("is place added "+isPlaceAdded);
  
  
  TouristCompany.showTouristplaceList();
  boolean placeNameUpdated = TouristCompany.updatePlaceName("Honnavar","cubbon park");
	System.out.println("is place name updated "+ placeNameUpdated);
	
	 TouristCompany.showTouristplaceList();
	
	boolean placeNameDeleted = TouristCompany.deletePlaceName("iskon temple");
	System.out.println("is place name deleted " +placeNameDeleted );

	 TouristCompany.showTouristplaceList();
	
   }
  

}