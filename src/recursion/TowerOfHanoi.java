package recursion;

public class TowerOfHanoi {

	
	public static void main(String[] args) {
		
		TowerOfHanoi obj = new TowerOfHanoi();
		obj.solve("pole A", "pole C", "pole B", 2);
	}
	
	
	public void solve (String source, String destination, String helper , int n) {
		
		if(n==1) {
			System.out.println("Move the plate " + n + "from " + source + "to " + destination);
			return;
		}
		
		solve( source,  helper,  destination,  n-1);
		System.out.println("Move the plate " + n + "from " + source + "to " +  destination);
		solve(helper, destination, source,  n-1);
	}
}
