package recursion;

public class GenerateBalancedParanthesis {

	public static void main(String[] args) {
		GenerateBalancedParanthesis obj = new GenerateBalancedParanthesis();
		int open = 1;
		int closed = 1;
		obj.generate("", open, closed);
	}

	public void generate(String output, int open, int closed) {
		if (open == 0 && closed == 0) {
			System.out.println(output);
			return;
		}
		if (open > 0) {
			output = output + "(";
			open--;
			generate(output, open, closed);
		}
		if ( closed > open) {
			output = output + ")";
			closed--;
			generate(output, open, closed);
		}
	}
}
