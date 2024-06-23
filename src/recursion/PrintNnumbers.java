package recursion;

public class PrintNnumbers {

	public static void main(String[] args) {
		PrintNnumbers obj = new PrintNnumbers();
		obj.print(10);
	}
	
	public void print(int n) {
		
		if(n==0) {			
			return;
		}
		print(n-1);
		System.out.println(n);		
		
	}
}
