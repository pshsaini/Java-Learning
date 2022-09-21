package JavaBasics;

public class ConditionJava {

	public static void main(String[] args) {
		int a=300;
		int b=200;

		if(a>b)  
		{
		    System.out.println("a is greater than b and value of a is "+a);

		}
		else if (b>a)  //agar if aayeaga toh condition is mandatory
		{
		    System.out.println("b is greater than a and value of b is "+b);

	}
		else {
		System.out.println("value of a and b are equal " +a);
		}
		
		
		// AND (&&) and OR (||) operators.
		
		
		//AND operator Example
		int c=2000;
		int d=3000;
		int e=400;

		
		if(c>d && c>e) 
		{
		    System.out.println("C is greatest and value of c is "+c);
		}
		else if(d>e) 
		{
		    System.out.println("d is greatest and value of d is "+d);
		}
		else 
		{
		    System.out.println("e is greatest and value of e is "+e);
		}

		// OR operator example
		
		String s1="Piyush";
		String s2="Akshay";
		String s3="Chinkesh Saini";
		String s4="Rajasthani";

		if (s1.contains("Saini")|| s2.contains("Saini")|| s3.contains("Saini")|| s4.contains("Saini")) {
		System.out.println("Name of the person:");
		
		}
		
		if (s1.contains("Saini")&& s2.contains("Saini")&& s3.contains("Saini")&& s4.contains("Saini")) {
			System.out.println("XYZPP:");
			
			
			}
		piyush();  //For calling another methods, which are not main.
	}

//2nd method
	public static void piyush() {
		
		//boolean b = true; 
		//boolean c = true;
		
		if(true) {
			System.out.println("Ye Print hoga ya nhi????????  ");
			
		}
		
		if (true)
		{
			System.out.println("Ye Bh print hoga ya nahiiiii??");
		}
		
		
	}
	
}