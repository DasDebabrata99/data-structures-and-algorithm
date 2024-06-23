package recursion;

import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
	
	public static void main(String[] args) {
		JosephusProblem obj = new JosephusProblem();
		int n = 40;
		int k =7;
		List<Integer> persons = new ArrayList<>();
		for(int i = 1; i<=n; i++) {
			persons.add(i);
		}
		int start =0;
		
		obj.solve(persons, k, n, start);
	}
	
	public void solve(List<Integer> persons,int k, int n, int start) {
		
		if(persons.size() == 1) {
			System.out.println(persons.get(0));
			return;
		}
		
		int kill = (start + k-1)%persons.size() ;
		start = kill;
		persons.remove(kill);
		solve(persons, k, n, start);
	}

}
