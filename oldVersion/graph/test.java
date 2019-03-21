package graph;

import java.util.LinkedList;
import java.util.Queue;

public class test {

	public static void main(String[] args) {
		int n = 12;
		test test = new test();
		int res = test.numSquares(n);
		System.out.println(res);

	}
	
	public int numSquares(int n) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        if(isSquare(n)){
            return 1;
        }
        queue.offer(n);

        while(!queue.isEmpty()){
            int len = queue.size();
            for (int z=0;z<len;z++){
                int top = queue.peek();
                queue.poll();
                for(int i=0;i<=Math.sqrt(top);i++){
                    int m = top-i*i;
                    System.out.println(m);
                    if(isSquare(m)){
                        count +=2;
                        return count;
                    }
                    if(m==top){
                        continue;
                    }
                    queue.offer(m);
                }
                System.out.println("___");
            }
            count++;
            System.out.println(count);
            System.out.println("___");
        }
        return count;
    }
    
    public static boolean isSquare(int n){
        double temp = Math.sqrt(n);
        int m = (int) temp;
        return m*m==n;
    }
}
