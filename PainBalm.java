class PainBalm{

  public static void main(String[] goodBalm){
   String name = "Amurtanjan";
   double price = 45;
   int quantityInGms = 20;
   String ingredients[] = {"Pudina" , "Gandhapura Patra Taila" , "ointment base Q.S."};

    System.out.println("Details of " + name + " are :");
	System.out.println("Price of " + name + " is " + price);
	System.out.println("quantity is " + quantityInGms);
	System.out.println("Ingredients " + " are: ");
	for(String Ingredient : ingredients){
	System.out.println(Ingredient + " , ");
	}

}
}