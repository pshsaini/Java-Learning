package OOPS;

public class subExample extends superExample{

	public static void main(String[] args) {
		superExample se=new subExample();
	   	 //se.div();
	   	 //se.mul();
	   	 se.add();
	   	 se.sub();

	    }

	public void div() {
	    System.out.println("div");
	}
	    
	public void mul() {
	    System.out.println("mul");
	}

	public void add() {
	    System.out.println("Child Addition");
	}


	}

