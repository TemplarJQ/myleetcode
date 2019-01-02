package leetcode;

import java.util.Arrays;

public class third_414 {

	public int find(int[] nums) {
		int len = nums.length;
        Arrays.sort(nums);
        int cnt = 1;
        int[] res = new int[4];
        res[0] = nums[len-1];
//        System.out.println("flag");
        if(len <= 2){
            return nums[0];
        }
        for(int i=len-2;i>=0;i--){
            if(cnt == 3){
                break;
            }
            else{
                if(res[cnt-1]!=nums[i]){
                	System.out.println("flag");
                	System.out.println(res[cnt-1]+"ok"+nums[i]+"flag");
                    res[cnt++] = nums[i];
                    System.out.println(res[cnt]+"ok"+nums[i]+"flag");
                    System.out.println("flag:"+cnt);
                    
                }else{continue;}
            }
            
        }
        System.out.println("flag:"+cnt);
        if(cnt == 3){System.out.println(res[0]+"ok"+res[1]+"flag"+res[2]);return res[2];}
        else{return res[0];}
    }
	
	public static void main(String[] args) {
		int[] arr = {3,2,1};
		third_414 tt = new third_414();
		int res = tt.find(arr);
		System.out.println(res);
	}
}
