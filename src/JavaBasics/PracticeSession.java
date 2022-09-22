package JavaBasics;

public class PracticeSession {

	private static final boolean Value = false;

	public static void main(String[] args) {

		int a=20;
		int b=20;
		int c=a*b;
		
		if (a>b) {
			System.out.println("a have to be multiplied by 10:" +a*10);
		}
		
		else if (b>a) {
			System.out.println("a have to be multiplied by 5:" +a*5);
		}
	    else if (a==b) {
			System.out.println("a have to be multiplied by 5:" +c);

		}
		//if d>e print the difference between them.
		
		int d=15;
		int e=20;
		int g = e-d;
		
		if (d>e) {
		
			for (int f=1; f<=g; f++) {
				System.out.println("Value of f:" +f);
				
		}
		}
			//if e>d, print, the difference should be printed in descending order.
			
			else if (e>d) {
				
				for (int h=g; h>=1; h--) {
					System.out.println("Value of h:" +h);
			
		}
		
		
		
		}
		
	}
	
}
	


