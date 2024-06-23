package recursion;

public class PermutationCaseWithDigit {
	public static void main(String[] args) {
		PermutationCaseWithDigit obj = new PermutationCaseWithDigit();
		obj.solve("a1B2", "");
	}
	
	public void solve(String input, String output) {
		
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		char inputChar = input.charAt(0);
		if(!Character.isAlphabetic(inputChar)) {
			input = input.substring(1);
			output = output + inputChar;
			solve(input, output);
		}else {
			String output1 = output + input.substring(0,1).toLowerCase();
			String output2 = output + input.substring(0,1).toUpperCase();
			input = input.substring(1);
			solve(input, output1);
			solve(input, output2);
			
		}
		
	}

}
