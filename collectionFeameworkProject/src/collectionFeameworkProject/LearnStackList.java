package collectionFeameworkProject;

import java.util.Stack;

public class LearnStackList {
	public static void main(String[] args) {
		Stack<String>s=new Stack<>();
		s.push("Lion");
		s.push("Tiger");
		s.push("Elephant");
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
	}

}
