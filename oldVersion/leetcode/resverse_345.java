package leetcode;

public class resverse_345 {

	public String reserve(String s) {
		char[] cc = s.toCharArray();
        int head = 0;
        int tail = s.length()-1;
        char temp = 'a';
        while(head<tail){
        	System.out.println("head--:"+head);
        	System.out.println("tail--:"+tail);
            while(head<tail&&!isVowel(cc[head])){
            	System.out.println("head:"+head);
                head++;
                System.out.println("head++:"+head);
            }
            while(head<tail&&!isVowel(cc[tail])){
            	System.out.println("tail:"+tail);
                tail--;
            }
            if(head<tail){
                System.out.println("resh1:"+cc[head]);
                System.out.println("rest1:"+cc[tail]);
                temp = cc[head];
                System.out.println("resh2:"+cc[head]);
                System.out.println("rest2:"+cc[tail]);
                cc[head] = cc[tail];
                System.out.println("resh3:"+cc[head]);
                System.out.println("rest3:"+cc[tail]);
                cc[tail] = temp;
                System.out.println("resh4:"+cc[head]);
                System.out.println("rest4:"+cc[tail]);
                tail--;
                head++;
            }
        }
        String res = String.valueOf(cc);
        return res;
	}
	
	public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
	
	public static void main(String[] args) {
		String string = "hello";
		resverse_345 rr = new resverse_345();
		String tString = rr.reserve(string);
		System.out.println(tString);
	}
}
