package OOPS;

public class childExample extends ParentExample{//extends is used to inherit
	
public static void main(String[] args) {
	
childExample ce=new childExample();
ce.div();
ce.mul();
ce.add(); //inherited from Parent class
ce.sub(); //inherited from Parent class
		
		
		
	}
public void div() {
	System.out.println("Div with in Child");
}
public void mul() {
	System.out.println("Mul with in Child");

}
}



