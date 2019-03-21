package leetcode;

public class removeDuplicates_26 {
	
	public int show(int[] nums) {
		int len = nums.length;
		//只需要记录数字个数即可
		int number = 0;
		for(int i= 0;i<len;i++) {
			if(nums[i]!=nums[number]) {
				number++;
				nums[number] = nums[i];
			}
		}
		number++;
		return number;
	}
	public static void main(String[] args) {
		removeDuplicates_26 tt = new removeDuplicates_26();
		int nums[] = {1,2,2,2,3,4,5,5,7,8,9,9};
		int key = tt.show(nums);
		System.out.println(key);
	}

}
