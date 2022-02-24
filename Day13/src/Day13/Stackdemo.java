package Day13;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<String> oj= new Stack<>();
		oj.push("Apple");
		oj.push("Banana");
		oj.push("Orange");
		oj.push("Mango");
		System.out.println(oj);
		
		oj.pop();
		System.out.println(oj);
		oj.pop();
		System.out.println(oj);
		oj.push("graps");

		oj.sort(null);
		System.out.println(oj);

	}

}
