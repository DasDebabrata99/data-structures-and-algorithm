package recursion;

import java.util.Stack;

public class DeleteMiddleInStack {

	public static void main(String[] args) {
		DeleteMiddleInStack obj = new DeleteMiddleInStack();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		int middle = stack.size()/2;
		obj.delete(stack, middle);
		System.out.println(stack);
		
	}
	
	public void delete(Stack st, int k) {
	    
		if(k == 0) {
			st.pop();
			return;
		}
		int val =  (int) st.pop();
		
		delete(st, k-1);
		st.push(val);
	}
}
