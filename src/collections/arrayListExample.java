package collections;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {

ArrayList<String> al=new ArrayList<String>();

//Adding n no. of arrays 
int numbers[]= {10,15,45,765,888,7};
int sum=0;

for(int i=0; i < numbers.length; i++) {
	sum = sum + numbers[i];
	
}
System.out.println(sum);
//

al.add("Tosca");//0th index
al.add("Selenium");//1st index
al.add("UFT");//2nd index
al.add("JMeter");//3rd index
al.add("Loadrunner");//4th index

System.out.println(al.get(0));
System.out.println(al.get(2));
System.out.println(al.get(1));
System.out.println(al.get(4));

System.out.println("Size of ArrayList is "+al.size());

//System.out.println(al.remove(3));
System.out.println(al.get(1));


for(int a=0;a<5;a++) {
  System.out.println("Value are "+al.get(a));


	}
	}
}

