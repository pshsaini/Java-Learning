package sampleAccessModifier;

import accessModifier.defaultExample;
import accessModifier.protectedExample;

public class testProtected {

		public static void main(String[] args) {
		    //    protectedExample pe1=new protectedExample();
		   	 //pe1.a
		   	 
		   	 defaultExample de=new defaultExample();
		   	 de.defaultprint();//will fail as method is default and using from different package

	}

}
