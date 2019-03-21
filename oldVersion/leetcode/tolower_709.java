package leetcode;

public class tolower_709 {

	public String tolower(String str) {
		 char[] arr = str.toCharArray();
	        int len = str.length();
	        for(int i=0;i<len;i++){
	            if(arr[i]>='A'&&arr[i]<='Z'){
	                arr[i] += 32;
	            }
	        }
	        return String.valueOf(arr);
//		int i=0;
//        int len=str.length();
//        char[] chs=str.toCharArray();
//        for(;i<len;i++){
//            if(chs[i]>='A'&& chs[i]<='Z'){
//                chs[i]+=32;
//            }
//        }
//        return String.valueOf(chs);
	}
	
	public static void main(String[] args) {
		String string = "AHello";
		tolower_709 tt = new tolower_709();
		String zz = tt.tolower(string);
		System.out.println(zz);
	}
}
