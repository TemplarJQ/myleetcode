package leetcode;

import java.util.ArrayList;
import java.util.List;

public class test_arrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2, 2);
		for(Integer i:list) {
			System.out.print(i+"--");
		}
	}
}
