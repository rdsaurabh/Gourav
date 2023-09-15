package linkedlist;

import java.util.Comparator;
import java.util.TreeMap;

public class LinkedListClient {
	  
	
	public static void main(String[] args) {
		DLL l = new DLL();
		
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		l.add(0, 40);
		System.out.println(l);
		l.add(2,50);
		System.out.println(l);
		l.add(1,60);
		System.out.println(l);
		l.add(6,70);
		System.out.println(l);
		l.remove(4);
		System.out.println(l);
	}

}
