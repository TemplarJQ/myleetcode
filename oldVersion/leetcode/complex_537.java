package leetcode;

public class complex_537 {

	public int getReal(String s){
        int real = 0;
        int flag = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                flag = -1;
                continue;
            }
            if(s.charAt(i)=='+'){
                return flag*real;
            }else{
                real = real*10 + (s.charAt(i)-'0');
            }
        }
        return flag*real;
    }
    
    public int getComplex(String s){
        int complex = 0;
        int flag = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='+'){
                continue;
            }
            if(s.charAt(i)=='+'){
            	continue;
            }
            if(s.charAt(i)=='-'){
                flag = -1;
                continue;
            }
            if(s.charAt(i)=='j'){
                return flag*complex;
            }else{
                complex = complex*10 + (s.charAt(i)-'0');
            }
        }
        return flag*complex;
    }
	
	public static void main(String[] args) {
		String a = "1+1j";
		String b = "2+1j";
		
		complex_537 tt = new complex_537();
		
		int realA = tt.getReal(a);
        System.out.println("dsdad");
        int comA = tt.getComplex(a);
        System.out.println("dsdad");
        int realB = tt.getReal(b);
        System.out.println("dsdad");
        int comB = tt.getComplex(b);
        System.out.println("dsdad");
        int resReal = realA*realB - comA*comB;
        int resCom = realA*comB + realB*comA;
        StringBuilder buff = new StringBuilder();
        buff.append(resReal);
        buff.append("+");
        buff.append(resCom);
        buff.append("j");
        System.out.println(buff.toString());
	}
}
