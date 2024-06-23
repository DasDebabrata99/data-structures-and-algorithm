package recursion;

public class GenerateBinary {

	public static void main(String[] args) {
		GenerateBinary obj = new GenerateBinary();
		obj.generate(4, 1, 0, "1");

	}

	public void generate(int n, int ones, int zeros, String binary) {
		if (n == 0) {
			System.out.println(binary);
			return;
		}
		String op1 = binary + '1';
		generate(n-1, ones + 1, zeros, op1);
		
		if(ones>zeros) {
			String op2 = binary + '0';
			generate(n-1, ones , zeros+1, op2);
				
		}
		

	}
}
