package collections;

import java.util.Hashtable;

public class hashTableExample {

	public static void main(String[] args) {

Hashtable<Integer, String> table=new Hashtable<Integer, String>();
table.put(100, "One Hundred");  //table.put(Key, Value)
table.put(200, "Two Hundred");
table.put(300, "Three Hundred");
table.put(400, "Four Hundred");
table.put(100, "Five Hundred");

System.out.println(table.size());
System.out.println(table.get(200));
System.out.println(400);

	}

}
