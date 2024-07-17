class Addition {
    public static void add(byte num1, byte num2) {
        System.out.println( + (num1 + num2));
    }

    public static void add(short weight, short num2, short num3, short num4) {
        short sum = (short) (weight + num2 + num3 + num4);
		 if (weight >= 50) {
            System.out.println("The person weight is Average value");
		 }
		 else{
		System.out.println("The person weight is Higher value");
	}
	System.out.println(+ sum);
}
}