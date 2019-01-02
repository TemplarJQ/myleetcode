package leetcode;

public class byte_717 {
	public boolean judge(int[] bits) {
		        if(bits.length==0){return false;}
		        if(bits.length == 1){
		            if(bits[0]==0){
		                return true;
		            }else{return false;}
		        }
		        int step = 0;
		        while(step<bits.length){
		        	System.out.println(step);
		            if((step+1)<bits.length){
		                if((bits[step]==1&&bits[step+1]==0)||(bits[step]==1&&bits[step+1]==1)){
		                    if((step+2)<=bits.length){
		                        if((step+2)==bits.length){
		                            return false;
		                        }else{step += 2;continue;}
		                    }
		                    else{
		                        break;
		                    }
		                }else{
		                    step++;
		                    continue;
		                }
		            }
		            if(bits[step]==0){
		                return true;
		            }else{return false;}
		        }
		        return false;
		    }
	public static void main(String[] args) {
		int[] bits = {0,0,1,0};
		byte_717 tt = new byte_717();
		boolean flag = tt.judge(bits);
		System.out.println(flag);
	}

}


