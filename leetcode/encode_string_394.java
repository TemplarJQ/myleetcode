package leetcode;

import java.util.Stack;


public class encode_string_394 {

		public String decodeString(String s) {
		        char[] arr = s.toCharArray();
		        Stack<Integer> stack1 = new Stack<Integer>();
		        Stack<String> stack2 = new Stack<String>();
		        
		        int index = 0;
		        int cnt = 0;
		        String sub = "";
		        String res = "";
		        
		        while(index<arr.length){
		        	sub = "";
		        	res = "";
		            if(arr[index]>='2'&&arr[index]<='9'){
		                stack1.push(Integer.parseInt(""+arr[index]));
		                index++;
		            }
		            if(arr[index]=='['){
		                stack2.push(String.valueOf('['));
		                index++;
		            }
		            if(arr[index]>='a'&&arr[index]<='z'){
		                stack2.push(String.valueOf(arr[index]));
		                System.out.println(stack2.peek());
		                if((index+1)>=arr.length) {
		                	break;
		                }else {
		                	index++;
		                }
		            }
		            if(arr[index]==']'){
		                while(true){
		                	System.out.println("peek:"+stack2.peek());
		                    if(stack2.peek().equals("[")){
		                        break;
		                    }
		                    sub = stack2.pop()+sub;
		                    System.out.println("sub:"+sub);
		                }
		                index++;
		                System.out.println("pop:"+stack2.peek());
		                stack2.pop();
		                System.out.println("pop1:"+stack1.peek());
		                cnt = stack1.pop();
		                for(int i=0;i<cnt;i++){
		                    res += sub;
		                }
		                System.out.println("res:"+res);
		                if(stack2.isEmpty()){
		                    stack2.push(res);
		                }else{
		                    sub = stack2.pop();
		                    stack2.push(sub+res);
		                }
		                System.out.println("peekres:"+stack2.peek());
		            }
		            System.out.println("index:"+index);
		        }
		        res = "";
		        while(!(stack2.isEmpty())){
		        	res = stack2.pop() +res;
		        }
		        return res;
		}
		
		public static void main(String[] args) {
			String string = "3[a]2[bc]";
//			String string = "2[abc]3[cd]ef";
			encode_string_394 rr = new encode_string_394();
			String kk = rr.decodeString(string);
			System.out.println(kk);
			
			char sh = '3';
			System.out.println(Character.isDigit(sh));
			System.out.println(Integer.parseInt(""+sh));
		}
		
	}

