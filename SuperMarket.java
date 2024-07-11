class SuperMarket{
  //Datatypes ref = value;
  
  
  static String groceries[] = {"Urad Dal" , "Wheat" , "Rice" , "Ragi" , "Chilli Powder" , "Black Paper" , "Honey" , "Oregano" , "Tamarend" , "Zucchini" , "Chilliflakes" , "coffe Powder" , "salt" , "Butter" , "oil"};
  static String vegetables[] = {"Beans" , "Garlic" , "Onion" , "Carrot" , "Ladies Finger's" , "Spinch" , "Beets" , "Beetroot" , "Broccoli" , "Brussels sprouts" , "Dill" , "Endive" , "Fennel" , "Iceberg Lettuce" , "artichoke"};
  static String perfumes[] = {"Fogg" , "Wild Stone" , "Skinn" , "Park Avenue" , "Axe" , "Enagage" , "Yardeley" , "Carolina Herrera" , "Creed Aventus" , "Paco Rabanne" , "Bleu de Chanel" , "Viktor & Rolf Spicebomb" , "Bleu de Chanel" , "Hungary water" , "Freshman"};
  static String fruits[] = {"Mango" , "Persimmon" , "Banana" , "Apple" , "Blackberry" , "Blueberry" , " Canary Melon" , "Lemon" , "Orange" , "Grapes" , "Currants" , "Apricot" , "Boysenberry" , "Papaya" , "Pineapple"};
  static String iceCreams[] = {"Kulfi" , "Sherbet" , "Sorbet" , "Frozen Yogurt" , "Soft Serve" , "Banana Nut Fudge" , "Black Walnut" , "Burgundy Cherry" , "Butterscotch Ribbon" , "Cherry Macaron" , "Chocolate" , "Chocolate Almond" , "Chocolate Chip" , "Date Nut" , "Orange Sherbet"};
  static String cosmetics[] = {"Moisturizers" , "Hair dyes" , "straighteners" , "Perfumes" , "primer" , "foundation" , "concealer" , "powder" , "eyeshadow" , "eyeliner" , "mascara" , "blush" , "lipsticks" , "nail polishes" , "facecream"};
  static String biscuits[] = {"Ginger" , "Custard Creams" , "sunfeast" , "Parle Hide & Seek" , "McVitie" , "Parle Krackjack" , "Oreo" , "Milano" , "PriyaGold" , "Anmol" , "digestive biscuits" , "ginger biscuits" , "Parle-G" , "monaco" , "Siro Vanilla"};
  static String coolDrinks[] = {"Sprite" , "Maza" , "Coca-Cola" , "Pepsi" , "Mirinda" , "Fanta" , "Fizz" , "Bovonto" , "Mountain Dew" , "Limca" , "Thumsup" , "Margarita" , "Daiquiri" , "Manhattan" , "Negroni"};
  static String sweets[] = {"Gulab Jamun" , "Burfi" , "Laddu" , "Carrot Halwa" , "Sooji Halwa" , "Besan Burfi" , "Kheer" , "Pastries" , "Cakes" , "Frozen" , "Rasmalai" , "Jalebi" , "Chikki" , "Peda" , "Mochi"};
  static String clothes[] = {"Jeans" , "Jocket" , "Pant" , "Shirt" , "Swimsuit" , "Gloves" , "Sweater" , "Coat" , "Trousers" , "Socks" , "tracksuit" , "Skirt" , "Tops"};
  static String footwears[] = {"Slippers" , "Rubber Shoes" , "high heels" , "flats" , "sneakers" , "boots" , "Crocks" , "athletic shoes" , "training Shoes" , "Leather Shoes" , "strapped sandals" , "wedges" , " ballet flats" , "loafers" , "Reebok Shoes"};
  static String snacks[] = {"Potato chips" , "Vadapav" , "Banana chips" , "pav baji" , "Samosa" , "String cheese" , "Pakoda" , "Aloo Tikki" , "Chaat" , "panipuri" , "Dahipuri" , "Gobimanchurian" , "Popcorn" , "hummus" , "avocado"};
  
  public static void main(String market[] ){
	  //method : execute statements (SOP);
	  System.out.println("Main started");
	  for(String grocery: groceries){
		  System.out.println(grocery);
	  }
	  for(String vegetable: vegetables){
		  System.out.println(vegetable);
	  }
	  for(String perfume: perfumes){
		  System.out.println(perfume);
	  }
	  for(String fruit: fruits){
		  System.out.println(fruit);
	  }
	  for(String icecream: iceCreams){
		  System.out.println(icecream);
	  }
	  for(String cosmetic: cosmetics){
		  System.out.println(cosmetic);
	  }
	  for(String biscuit: biscuits){
		  System.out.println(biscuit);
	  }
	  for(String coolDrink: coolDrinks){
		  System.out.println(coolDrink);
	  }
	  for(String sweet: sweets){
		  System.out.println(sweet);
	  }
	  for(String cloth: clothes){
		  System.out.println(cloth);
	  }
	  for(String footwear: footwears){
		  System.out.println(footwear);
	  }
	  for(String snack: snacks){
		  System.out.println(snack);
	  }
     /*System.out.println("List of the Groceries: " + groceries[0] + "\n" + groceries[1] + "\n" +  groceries[2] + "\n" + groceries[3] + "\n" + groceries[4] + "\n" + groceries[5] + "\n" + groceries[6] + groceries[7] + "\n"+ groceries[8] + "\n" + groceries[9] + "\n" + groceries[10] + "\n" + groceries[11] + "\n" + groceries[12] + "\n" + groceries[13] + "\n" + groceries[14] + "\n");
     System.out.println("List of the Vegetables: " + vegetables[0] + "\n"  + vegetables[1] + "\n" + vegetables[2] + "\n" + vegetables[3] + "\n" + vegetables[4] + "\n" + vegetables[5] + "\n" + vegetables[6] + "\n"  + vegetables[7] + "\n" + vegetables[8] + "\n" + vegetables[9] + "\n" + vegetables[10] + "\n" + vegetables[11] + "\n" + vegetables[12] + "\n" + vegetables[13] + "\n" + vegetables[14] + "\n");
	 System.out.println("List of the Perfumes: " + perfumes[0] + "\n" + perfumes[1] + "\n" + perfumes[2] + "\n" + perfumes[3] + "\n"+ perfumes[4] + "\n" + perfumes[5] + "\n"  + perfumes[6] + "\n" + perfumes[7] + "\n" + perfumes[8] + "\n" + perfumes[9] + "\n"  + perfumes[10] + "\n" + perfumes[11] + "\n" + perfumes[12] + "\n" + perfumes[13] + "\n" + perfumes[14] + "\n");
	 System.out.println("List of the Fruits: " + fruits[0] + "\n" + fruits[1] + "\n" + fruits[2] + "\n" + fruits[3] + "\n" + fruits[4] + "\n" + fruits[5] + "\n" + fruits[6] + "\n" + fruits[7] + "\n" + fruits[8] + "\n"  + fruits[9] + "\n" + fruits[10] + "\n" + fruits[11] + "\n"+ fruits[12] + "\n" + fruits[13] + "\n" + fruits[14] + "\n");
	 System.out.println("List of the Icecreams: " + iceCreams[0] + "\n" + iceCreams[1] + "\n" + iceCreams[2] + "\n" + iceCreams[3] + "\n"  + iceCreams[4] + "\n"+ iceCreams[5] + "\n" + iceCreams[6] + "\n" + iceCreams[7] + "\n" + iceCreams[8] + "\n" + iceCreams[9] + "\n" + iceCreams[10] + "\n"+ iceCreams[11] + "\n" + iceCreams[12] + "\n" + iceCreams[13] + "\n" + iceCreams[14] + "\n");
	 System.out.println("List of the Cosmetics: " + cosmetics[0] + "\n" + cosmetics[1] + "\n" + cosmetics[2] + "\n" + cosmetics[3] + "\n"+ cosmetics[4] + "\n" + cosmetics[5] + "\n" + cosmetics[6] + "\n" + cosmetics[7] + "\n"+ cosmetics[8] + "\n" + cosmetics[9] + "\n"  + cosmetics[10] + "\n" + cosmetics[11] + "\n" + cosmetics[12] + "\n"  + cosmetics[13] + "\n" + cosmetics[14] + "\n");
	 System.out.println("List of the Biscuits: " + biscuits[0] + "\n" + biscuits[1] + "\n" + biscuits[2] + "\n" + biscuits[3] + "\n" + biscuits[4] + "\n" + biscuits[5] + "\n" + biscuits[6] + "\n" + biscuits[7] + "\n" + biscuits[8] + "\n" + biscuits[9] + "\n" + biscuits[10] + "\n" + biscuits[11] + "\n" + biscuits[12] + "\n" + biscuits[13] + "\n" + biscuits[14] + "\n");
	 System.out.println("List of the Cooldrinks: " + coolDrinks[0] + "\n" + coolDrinks[1] + "\n" + coolDrinks[2] + "\n" + coolDrinks[3] + "\n" + coolDrinks[4] + "\n" + coolDrinks[5] + "\n" + coolDrinks[6] + "\n" + coolDrinks[7] + "\n" + coolDrinks[8] + "\n" + coolDrinks[9] + "\n" + coolDrinks[10] + "\n" + coolDrinks[11] + "\n" + coolDrinks[12] + "\n" + coolDrinks[13] + "\n" + coolDrinks[14] + "\n");
	 System.out.println("List of the Sweets: " + sweets[0] + "\n" + sweets[1] + "\n" + sweets[2] + "\n" + sweets[3] + "\n" + sweets[4] + "\n" + sweets[5] + "\n" + sweets[6] + "\n" + sweets[7] + "\n" + sweets[7] + "\n" + sweets[8] + "\n" + sweets[9] + "\n" + sweets[10] + "\n" + sweets[11] + "\n" + sweets[12] + "\n" + sweets[13] + "\n" + sweets[14] + "\n");
	 System.out.println("List of the Clothes: " + clothes[0] + "\n" + clothes[1] + "\n" + clothes[2] + "\n" + clothes[3] + "\n" + clothes[4] + "\n" + clothes[5] + "\n" + clothes[6] + "\n" + clothes[7] + "\n" + clothes[8] + "\n" + clothes[9] + "\n" + clothes[10] + "\n" + clothes[11] + "\n" + clothes[12] + "\n" + clothes[13] + "\n" + clothes[14] + "\n");
	 System.out.println("List of the Footwears: " + footwears[0] + "\n" + footwears[1] + "\n" + footwears[2] + "\n" + footwears[3] + "\n" + footwears[4] + "\n" + footwears[5] + "\n" + footwears[6] + "\n" + footwears[7] + "\n" + footwears[8] + "\n" + footwears[9] + "\n" + footwears[10] + "\n" + footwears[11] + "\n" + footwears[12] + "\n" + footwears[13] + "\n" + footwears[14] + "\n");
	 System.out.println("List of the Snacks: " + snacks[0] + "\n" + snacks[1] + "\n" + snacks[2] + "\n" + snacks[3] + "\n" + snacks[4] + "\n" + snacks[5] + "\n" + snacks[6] + "\n"  + snacks[7] + "\n" + snacks[8] + "\n" + snacks[9] + "\n"  + snacks[10] + "\n" + snacks[11] + "\n" + snacks[12] + "\n" + snacks[13] + "\n" + snacks[14] + "\n");*/
	 
	 
	 
	 
	 
	 
	 System.out.println("Main ended");
  
  }
}
                                                                                                                                                                                                                                                                                                               