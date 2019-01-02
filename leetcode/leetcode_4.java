package leetcode;

public class leetcode_4 {

	public double go(int[] nums1,int[] nums2) {
		double first = 0.0;
        double second = 0.0;
        int step_1 = 0;
        int step_2 = 0;
        double mid = (nums1.length+nums2.length)/2;
        System.out.println(nums1.length);
        System.out.println(nums2.length);
        System.out.println(mid);
        if(((nums1.length+nums2.length)%2)==1){
            while((step_1+step_2)<mid-1){
                if(nums1[step_1]<nums2[step_2]){
                    step_1++;
                    first = Math.min(nums1[step_1],nums2[step_2]);
                }else{
                    step_2++;
                    first = Math.min(nums1[step_1],nums2[step_2]);
                }
            }
            return first;
        }
        if(((nums1.length+nums2.length)%2)==0){
            while((step_1+step_2)<=mid-1){
                if(nums1[step_1]<nums2[step_2]){
                    step_1++;
                    second = first;
                    first = Math.max(nums1[step_1],nums2[step_2]);
                }else{
                    step_2++;
                    second = first;
                    first = Math.max(nums1[step_1],nums2[step_2]);
                }
            }
            return (first+second)/2;
        }
        return first;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1,3,7};
		int[] nums2 = {2,5};
		leetcode_4 tLeetcode_4 = new leetcode_4();
		double t = tLeetcode_4.go(nums1, nums2);
		System.out.println(t);
	}
}
