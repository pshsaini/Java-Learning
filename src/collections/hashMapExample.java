package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class hashMapExample {

	public static void main(String[] args) {

HashMap<String, Integer> hm=new HashMap<String, Integer>();

hm.put("new", 1004);
hm.put("Piyush", 1000);
hm.put("Akshay", 1001);
hm.put("Anshul", 1002);
hm.put("new", 2003);
hm.put("Yatharth", 1003);

System.out.println(hm.size());

System.out.println(hm.get("Anshul"));

for(Map.Entry str: hm.entrySet()) {
	System.out.println(str.getKey()+"   "+str.getValue() );
	
}
	}

}
