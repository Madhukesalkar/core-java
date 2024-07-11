class Maggi{
  
   static String founderName = "Nestle Global"; 
   static String countryOfOrigin = "India";
   static int price = 10; 
   static int quantityInGrams = 130;
   static int expireDateInMonth = 6;   
   static String ingredients[] = {"Maida" , "Palm oil" , "lodised salt" , "Wheat gluten"};
  public static void main(String [] snacks){
  
  
  System.out.println("Details of Maggi is: ");
  System.out.println("Founder of the Maggi: " + founderName);
  System.out.println("Country of origin: " + countryOfOrigin);
  System.out.println("Price of the Maggi: " + price);
  System.out.println("Quantity of the Maggi in grams: " + quantityInGrams);
  System.out.println("Expire date in month: " + expireDateInMonth);
  System.out.println("Ingredients are: ");
  for(String ingredient : ingredients){
  System.out.println(ingredient + " , ");
  }
  
  
  
  
  
  }




}