package OOPS;

public class mthodOverload {

	public static void main(String[] args) {

//creating multiple functions with same name with different parameters
		
mthodOverload mo=new mthodOverload();
mo.add();
mo.add(12345);
mo.add("Method Overloading");
		
	}
public void add() {
int a=10;
int b=20;
int c=a+b;
System.out.println(c);

}
public void add(String st) {
	System.out.println(st);
}

public void add( int a) {
	System.out.println(a);
	
}
	
	
}
