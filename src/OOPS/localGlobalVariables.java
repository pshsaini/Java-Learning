package OOPS;

public class localGlobalVariables {

	 //Global variable
	static String st="Java OOPS session";
	
	
	public static void main(String[] args) {

		localGlobalVariables obj= new localGlobalVariables();
		obj.add();
		int b=20;
		//int c=a+b;
		System.out.println(st);
		
		
		
	}

	public void add ()  {
		int a=10;
		System.out.println(a);
		System.out.println(st);
	}
	
}
