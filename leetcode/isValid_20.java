package leetcode;

import java.util.Stack;

public class isValid_20 {
	public boolean show(String s) {
		Stack<String> p = new Stack<String>();
		int len = s.length();
		String[] arr = s.split("");
		String c = "";
		for(int i=0;i<len;i++) {
			if(arr[i].equals("(")||arr[i].equals("{")||arr[i].equals("[")) {
				p.push(arr[i]);
			}
			if((arr[i].equals(")")||arr[i].equals("}")||arr[i].equals("]"))&&p.isEmpty()) {
				return false;
			}
			if(arr[i].equals(")")||arr[i].equals("}")||arr[i].equals("]")) {
				c = p.pop();
				if((c.equals("(")&&arr[i].equals(")"))||(c.equals("{")&&arr[i].equals("}"))||(c.equals("[")&&arr[i].equals("]"))) {
					continue;
				}else {
					return false;
				}
			}
		}
		if(p.isEmpty()) {return true;}
		else {return false;}
	}
	
	public boolean show2(String s) {
		if (s==null) {
			return false;
		}
		Stack<Character> stack=new Stack<Character>();
		char[] schar=s.toCharArray();
		for (int i = 0; i < schar.length; i++) {
			if (!stack.isEmpty()&&((stack.peek()=='('&&schar[i]==')')||
					(stack.peek()=='['&&schar[i]==']')||
					(stack.peek()=='{'&&schar[i]=='}'))) {
				stack.pop();
			}else{
				stack.push(schar[i]);
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		String string = "()]";
		isValid_20  tt = new isValid_20();
		boolean flag = tt.show(string);
		System.out.println(flag);
	}

}
