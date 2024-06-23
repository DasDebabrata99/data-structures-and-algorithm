package recursion;

public class PrintSubSets {

	public static void main(String[] args) {
		PrintSubSets obj = new PrintSubSets();
		String input = "ab";
		String output = "";
		obj.solve(input, output);
	}
	
	public void solve(String input, String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		String output1 = output;
		String output2 = output + input.charAt(0);
		input = input.substring(1);
		solve(input, output1);
		solve(input, output2);
	}
}
