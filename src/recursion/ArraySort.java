package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySort {

	
	public static void main(String[] args) {
		
		ArraySort obj = new ArraySort();
		List<Integer> list = new ArrayList<Integer>();//(Arrays.asList(8,4,1,7));
		list.add(8);
		list.add(4);
		list.add(1);
		list.add(7);
		System.out.println(obj.sort(list));
		
	}
	
	public List<Integer> sort(List<Integer> list){		
		
		if(list.size() == 1) {
			return list;
		}
		int value = list.get(list.size()-1);
		list = list.subList(0, list.size()-1);
		
		sort(list);
		
		insert(list, value);
		return list;
		
	}
	
	public void insert(List<Integer> list, int temp) {
		if(list.size()==0 || list.get(list.size()-1) < temp) {
			list.add(temp);
			return ;
		}
		
		int val = list.get(list.size()-1);
		list = list.subList(0, list.size()-1);
		insert(list, temp);
		list.add(val);
		return;
	}
}