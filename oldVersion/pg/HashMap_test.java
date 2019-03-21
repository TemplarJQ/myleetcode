package pg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;
import javax.swing.plaf.synth.SynthStyle;

public class HashMap_test {
	public void change(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int temp = 0;
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				temp = map.get(nums[i]);
				map.put(nums[i], ++temp);
			}else {
				map.put(nums[i], 1);
			}
		}
		int max = 0;
		
		for(Integer key:map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
			}
		}
		
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println(max+" show:"+map.get(max));
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,2,2,1,1,1,3,3,3,3,3,1,1,1,1};
		HashMap_test test = new HashMap_test();
		test.change(nums);
	}
	

}
