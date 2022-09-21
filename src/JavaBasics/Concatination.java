package JavaBasics;

public class Concatination {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int cjh = a+b;
		String st=" Java session ";

		System.out.println("a+b");
		System.out.println(a+b);
		System.out.println(a+st+b);
		System.out.println(st+a+b);

		//int c=a+st;
		String pqr=st+a;  // IDE feature, as it upcast's integer value to string
		System.out.println(pqr);
		
		char c= 'A';    //a=97, b=98 (ASCII value) and A=65, B=66 (ASCII value)
		String c1= st+c;
		String p1=st+c;
		
		char pi=(char) (c+a);
		int pi1=a+c;
		
		System.out.println("char+integer " +pi+"  "+pi1);
				
	}

}
