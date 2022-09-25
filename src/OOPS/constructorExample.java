package OOPS;

public class constructorExample {

	public static void main(String[] args) {

		constructorExample ce1=new constructorExample();
		constructorExample ce2=new constructorExample("Java Session");
		
		ce1.print();
	}
	
public void print() {
	System.out.println("new test");
}

public constructorExample() {
	System.out.println("constructorExample");
}

public constructorExample(String str) {
	System.out.println(str);

}
}
