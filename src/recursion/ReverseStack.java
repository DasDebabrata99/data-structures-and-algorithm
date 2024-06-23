package recursion;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		ReverseStack obj = new ReverseStack();
		Stack stack = new Stack();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.add(6);
		System.out.println(stack);
		obj.reverse(stack);
		System.out.println(stack);
	}
	
	public void reverse(Stack stack) {
		if(stack.size()==0) {
			return;
		}
		
		int val = (int) stack.pop();
		reverse(stack);
		insertAtStart(stack, val);
		
	}
	
	public void insertAtStart(Stack stack, int item) {
		if(stack.size() == 0) {
			stack.push(item);
			return;
		}
		int val = (int) stack.pop();
		insertAtStart(stack, item);
		stack.push(val);
	}
}
