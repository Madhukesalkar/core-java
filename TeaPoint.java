import java.util.Arrays;

class TeaPoint{

   static String teaNames[]={null,null,null,null,null,null};
   static int index;
  
  public static boolean addTeaName(String teaName)
  {
  boolean isTeaNameadded=false;
  
  if(index< teaNames.length){
  if(teaName !=null){
  teaNames[index++]=teaName;
  isTeaNameadded =true;
  
  }
  else
  System.out.println("Tea name is invalid");
  }
  else
  System.out.println("sorry ... teaName is full..");

    return isTeaNameadded;
  }

  public static void showTeaName(){
  
  System.out.println("main started");
  
  for(String teaName:teaNames)
  System.out.println(teaName);
   System.out.println("main ended"); 
  }
  
  public static boolean updateTeaName(String newTeaName,String oldTeaName){
	  System.out.println("update teaName stated");
	 boolean isTeaNameUpdated=false;
	  for(int position=0;position<teaNames.length;position++ ){
		  if(teaNames[position]==oldTeaName){
			  teaNames[position]=newTeaName;
			  isTeaNameUpdated = true; 
		  }
  }
	      if(isTeaNameUpdated==false)
		  System.out.println(oldTeaName +"not found");
	 
	 System.out.println("update teaName ended");
	 return isTeaNameUpdated;
  }
  
  public static boolean deleteTeaName(String teaName){
	  
	  boolean isTeaNameDeleted = false;
	  int position,newPosition;
	  for(position=0,newPosition=0;position<teaNames.length;position++){
		  if(teaNames[position]!= teaName){
			  teaNames[newPosition] = teaNames[position];
               newPosition++;
		  }
		  else 
			  isTeaNameDeleted= true;
	  }
	  int newLength= newPosition;
	  teaNames =Arrays.copyOf(teaNames,newLength);
	  
	  if(isTeaNameDeleted==false){
		  System.out.println(teaName +"not found");
		  
		   }
		return isTeaNameDeleted;  
  }
}