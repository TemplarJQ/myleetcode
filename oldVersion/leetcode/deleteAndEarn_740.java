package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class deleteAndEarn_740 {
	public static void main(String[] args) {
		int[] arr = {2, 2, 3, 3, 3, 4};
		deleteAndEarn_740 tAndEarn_740 = new deleteAndEarn_740();
		int cnt = tAndEarn_740.show(arr);
		System.out.println(cnt);
	}
	
	public int show(int[] arr) {
		
		Map<Integer, Integer> count = new HashMap<>();
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			if(count.containsKey(arr[i])) {
				count.put(arr[i], count.get(arr[i])+1);
			}else {
				count.put(arr[i], 1);
			}
		}
		Arrays.sort(arr);
		int cnt = 0,pre = 0,next = 0;
		int flag = 0;
		int num = arr.length-1;
		while(num>0) {
			cnt = count.get(arr[num])*arr[num];
			if(count.containsKey(arr[num]+1)) {
				pre = count.get(arr[num]+1)*(arr[num]+1);
			}
			if(count.containsKey(arr[num]-1)) {
				next = count.get(arr[num]-1)*(arr[num]-1);
			}
			if(cnt>=pre+next) {
				res += cnt;
				flag = arr[num]-1;
				while(arr[num]>=flag) {
					arr[num] = 0;
					num--;
				}
			}else {
				flag =arr[num];
				while(arr[num] == flag) {
					arr[num] = 0;
					num--;
				}
			}
			cnt = pre = next =0;
		}
//		Iterator<Entry<Integer, Integer>> iterator = count.entrySet().iterator();
//		while(iterator.hasNext()) {
//			Entry entry = iterator.next();
//			System.out.println(entry.getKey()+"--"+entry.getValue());
//		}
		
		return res;
		
	}
}
