package leetcode;


public class reverse_557 {
	
	public String reverse(String s) {
		String[] sub = s.split(" ");
		String res = "";
		for(String temp: sub) {
			char[] mid = temp.toCharArray();
			swap(mid, 0, temp.length()-1);
			temp = String.valueOf(mid);
		}
		res = sub.toString();
		return res;
		
	}
	
	public void swap(char[] arr, int begin, int end) {
        while(begin <= end) {
            char temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
    }
	
	public static void main(String[] args) {
		String string = "Let's take LeetCode contest";
		resverse_345 tt = new resverse_345();
		String reString = tt.reserve(string);
		System.out.println(reString);
	}

}
