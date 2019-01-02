package leetcode;

public class stringplus_43 {

	public static void main(String[] args) {
		String num1 = "123456789";
		String num2 = "987654321";
		stringplus_43 tt = new stringplus_43();
		String reString = tt.plus(num1, num2);
		System.out.println(reString);
	}
	
	public String plus(String num1, String num2) {
		int len1 = num1.length();
        int len2 = num2.length();
        int val1 = 0,val2=0;
        for(int i=0;i<len1;i++){
            val1 = val1*10 + (num1.charAt(i)-'0');
        }
        for(int i=0;i<len2;i++){
            val2 = val2*10 + (num2.charAt(i)-'0');
        }
//        int n = val1*val2;
//        System.out.println(n);
        int pre = 0;
        int cur = 0;
        if(val1==0||val2==0) {return "0";}
        StringBuilder str = new StringBuilder();
        while(val1>0&&val2>0) {
        	System.out.println("val1:"+val1+" val2:"+val2);
        	System.out.println("pre:"+pre);
        	cur = val1*(val2%10) + val1+pre;
        	System.out.println("cur:"+cur);
        	if(cur>=10) {
        		str.append(Integer.toString(cur%10));
        		cur /= 10;
        		pre = cur;
        	}else {
        		pre = 0;
        		str.append(Integer.toString(cur));
        	}
        	val1 /= 10;
        	val2 /= 10;
        }
        if(val1!=0) {
        	while(val1>0) {
        		str.append(Integer.toString(val1%10));
                val1 /= 10;
        	}
        }
        if(val2!=0) {
        	while(val2>0) {
        		str.append(Integer.toString(val2%10));
                val2 /= 10;
        	}
        }
        return str.reverse().toString();
	}
}
