package recursion;

public class PermutationWithCase {
	public static void main(String[] args) {
		PermutationWithCase obj = new PermutationWithCase();
		String input = "abc";
		obj.solve(input,"");
	}
	
	public void solve(String input, String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		
		String output1 = output + input.substring(0,1);
		String output2 = output + input.substring(0,1).toUpperCase();
		input = input.substring(1);
		solve(input, output1);
		solve(input, output2);
	}

}
