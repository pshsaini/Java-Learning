package accessModifier;

public class testRunAccess {

	public static void main(String[] args) {
		 protectedExample pe=new protectedExample();
	   	 pe.add();
	   	defaultExample de=new defaultExample();
	   	 de.defaultprint();
	   	 
	   	 privateExample pre=new privateExample();
	   	 pre.printPrivate();//can't call this function as its Private

	}

}
