class TeaPointRunner{


  public static void main(String[] teapoint){
 
    boolean teaAdded = TeaPoint.addTeaName("Amruth tea");
	System.out.println("is tea name added" + teaAdded);
	
	 teaAdded = TeaPoint.addTeaName("green tea");
	System.out.println("is tea name added" + teaAdded);
	
	 teaAdded = TeaPoint.addTeaName("ginger tea");
	System.out.println("is tea name added" + teaAdded);
	
	 teaAdded = TeaPoint.addTeaName("masala tea");
	System.out.println("is tea name added" + teaAdded);
	
	teaAdded = TeaPoint.addTeaName("irani tea");
	System.out.println("is tea name added" + teaAdded);
	
	 teaAdded = TeaPoint.addTeaName("chocolate tea");
	System.out.println("is tea name added" + teaAdded);
	
	teaAdded = TeaPoint.addTeaName("clasic tea");
	System.out.println("is tea name added" + teaAdded);
	
	TeaPoint.showTeaName();
	
	boolean teaUpdated = TeaPoint.updateTeaName("ajwan tea","masala tea");
	System.out.println("is tea name updated "+ teaUpdated);
	TeaPoint.showTeaName();
	
	boolean teaNameDeleted = TeaPoint.deleteTeaName("irani tea");
	System.out.println("is tea name deleted " +teaNameDeleted );

	TeaPoint.showTeaName();	
	
   }

}