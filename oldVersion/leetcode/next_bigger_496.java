package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class next_bigger_496 {

	public static void main(String[] args) {
		int[] arr1={4,1,2};
        int[] arr2={1,3,4,2};
        int[] arr=nextGreaterElement(arr1,arr2);
        System.out.println(Arrays.toString(arr));
	}
	
	static public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<>();

		for(int num:nums2) {
			while(!stack.isEmpty()&&stack.peek()<num) {
				System.out.println(stack.peek()+"  "+ num);
				map.put(stack.peek(), num);
				stack.pop();
			}
				
			stack.push(num);
			
		}
		int[] res = new int[nums1.length];
		for(int j=0;j<nums1.length;j++) {
			System.out.println(nums1[j]+"  "+map.get(res[j]));
			res[j] = map.getOrDefault(nums1[j], -1);
		}
		return res;

		
	}
}
