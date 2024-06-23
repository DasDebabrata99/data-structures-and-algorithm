package recursion;

public class PermutaionWithSpace {

	public static void main(String[] args) {
		PermutaionWithSpace obj = new PermutaionWithSpace();
		String input = "abc";
		String output = "";
		obj.solve(input, output);
	}
	
	public void solve(String input, String output) {
				
		if(input.length()==1) {
			output = output + input.charAt(0); 
			System.out.println(output);
			return;
		}
		String output1 = output + input.charAt(0) + " ";
		String output2 = output + input.charAt(0);
		input = input.substring(1);
		solve(input, output1);
		solve(input, output2);
		
	}
}
