package Day13;

import java.util.LinkedList;

public class Linkedlstdemo {

	public static void main(String[] args) {
		LinkedList<Integer> oj=new LinkedList<>();
		oj.add(2);
		oj.add(1);
		oj.add(3);
		oj.add(6);
		oj.add(5);
		System.out.println(oj);
		
		oj.removeFirst();
		System.out.println(oj);
		oj.addFirst(100);
		System.out.println(oj);
		oj.element();
		System.out.println(oj);
		oj.indexOf(2);
	    oj.addLast(22);
	    System.out.println(oj);
	    oj.sort(null);
	    System.out.println(oj);
	}

}
