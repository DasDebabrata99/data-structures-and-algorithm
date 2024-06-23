package recursion;

public class Factorial {

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println(obj.factorial(6));
	}
	
	public int factorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		return factorial(num-1) * num;
		
	}	
}
