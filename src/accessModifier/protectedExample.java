package accessModifier;

public class protectedExample {

	protected protectedExample() {
	    System.out.println("Protected Constructor");
	}

	public static void main(String[] args) {
		protectedExample pe=new protectedExample();
	   	 pe.add();

	}
	protected void add() {
	    System.out.println("Protected Method");
	}
}
