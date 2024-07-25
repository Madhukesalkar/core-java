class FlipkartRunner{

  public static void main(String [] item){
  
  boolean itemAdded = Flipkart.addItemName("Remote");
  System.out.println("is item added "+itemAdded);
  
  itemAdded = Flipkart.addItemName("bottle");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("oven");
  System.out.println("is item added "+ itemAdded);

  itemAdded = Flipkart.addItemName("washing machine");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("furniture");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("bucket");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("clock");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("headphones");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("moblies");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("TV");
  System.out.println("is item added "+ itemAdded);
  
  itemAdded = Flipkart.addItemName("Water Heatr");
  System.out.println("is item added "+ itemAdded);

  Flipkart.showItemList();
  
  boolean itemUpdated = Flipkart.updateItemName("IronBOX","moblies");
  System.out.println("is item updated "+ itemUpdated);

  Flipkart.showItemList();
  
  boolean itemDeleted = Flipkart.deleteItemName("headphones");
  System.out.println("is item deleted "+ itemDeleted);
  
  Flipkart.showItemList();
  }

}