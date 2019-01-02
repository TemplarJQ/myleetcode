package leetcode;

import java.util.Stack;

public class basic_count_224 {

	    public int calculate(String s) {
	        Stack<Integer> stack = new Stack<>();
	        
	        int res = 0;
	        int flag = 1;
	        int len = s.length();
	        int result = 0;
	        
	        for(int i = 0;i < len;i++){
	            char sh = s.charAt(i);
	            System.out.println(sh);
	            if(sh==' '){
	                continue;
	            }
	            if(Character.isDigit(sh)){
	            	res = Integer.parseInt(""+sh);
	                while((i+1)<len&&Character.isDigit(s.charAt(i+1))){
	                    res = res*10 + Integer.parseInt(""+s.charAt(++i));
	                }
	                result += flag*res; 
	                System.out.println(res);
	            }else if(sh=='('){
	                stack.push(result);
	                result = 0;
	                stack.push(flag);
	                flag = 1;
	            }else if(sh == '+'){
	                flag = 1;
	            }else if(sh == '-'){
	                flag = -1;
	            }else if(sh==')'){
	                result = stack.pop()*res + stack.pop();
	                flag = 1;
	            }
	        }
	        return result;
	    }
	public static void main(String[] args) {
		String string = "1 + 1";
		basic_count_224 ss = new basic_count_224();
		int t = ss.calculate(string);
		System.out.println(t);
	}
}
