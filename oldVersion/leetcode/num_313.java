package leetcode;

import java.util.ArrayList;
import java.util.List;

public class num_313 {

	public static void main(String[] args) {
		int n = 12;
		int[] primes = {2,7,13,19};
		num_313 tt = new num_313();
		 int res = tt.reNum(n, primes);
		 System.out.println(res);
	}
	
	public int reNum(int n, int[] primes) {
		int[] plus = primes;
        int[] res = new int[n];
        res[0] = 1;
        int step = 1;
        int cnt = primes[0];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            for(int j=i+1;j<4;j++){
                list.add(primes[i]*primes[j]);
            }
        }
        for(Integer i:list) {
        	System.out.print(i+"--");
        }
        return 0;
	}
	
	public int minNum(int a,int b,int c,int d,int e){
        return Math.min(a,Math.min(b,Math.min(c,Math.min(d,e))));
    }
}
