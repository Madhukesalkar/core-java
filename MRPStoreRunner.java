class MRPStoreRunner{

  public static void main(String [] drink){
  
  boolean isAlcoholAdded = MRPStore.addalcoholName("Old Monk");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Brocode");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Bacardi");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("kingfisher");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Vodka");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Beer");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Rum");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Whisky");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Cognac");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Liquor");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  isAlcoholAdded = MRPStore.addalcoholName("Brandy");
  System.out.println("is alcohol Name added "+isAlcoholAdded);
  
  MRPStore.showAlcoholNameList();
  boolean alcoholNameUpdated = MRPStore.updateAlcoholName("cider","Beer");
	System.out.println("is alcohol name updated "+ alcoholNameUpdated);
	
	 MRPStore.showAlcoholNameList();
	
	boolean alcoholNameDeleted = MRPStore.deleteAlcoholName("Brocode");
	System.out.println("is alcohol name deleted " +alcoholNameDeleted );

	 MRPStore.showAlcoholNameList();
	
   
  }
}