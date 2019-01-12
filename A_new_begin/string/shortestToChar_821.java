class Solution {
    public int[] shortestToChar(String S, char C) {
        
        //最快的果然是dp做的
        
        //一个基础想法就是设置两个指针，先遍历一遍数组，将所有对应C的位置的都入栈，然后通过移动两个指针来判断
        //这个方法按说提升的速度不应该只有这么多啊
        int len = S.length();
        int[] res = new int[len];
        if(len==0){return res;}
        Stack<Integer> stack = new Stack<>();
        int flag = 0;
        for(int i=len-1;i>=0;i--){
            if(S.charAt(i)==C){
                stack.push(i);
            }
        }
        int left=0, right=0;
        if(stack.empty()){return res;}
        left = stack.pop();
        if(stack.empty()){
            right = left;
            flag = 1;
        }else{
            right = stack.pop();
        }
        for(int i=0;i<len;i++){
            if(flag==1){
                res[i] = Math.abs(i-right);
            }else{
                if(i+1>right){
                    if(stack.empty()){
                        flag = 1;
                        res[i] = 0;
                        continue;
                    }else{
                        res[i] = 0;
                        left = right;
                        right = stack.pop();
                        continue;
                    }
                }else{
                    if(i<=left){
                        res[i] = left - i;
                    }else if(i>left&&i<right){
                        res[i] = Math.min(i-left,right-i);
                    }
                }
            }
        }
        return res;
        
        //先实验一个超慢的看看会不会超时，这是O(n^2)的解法，居然战胜70%，简单题是因为例子简单吧
        // int len = S.length();
        // int[] flag = new int[len];
        // int[] res = new int[len];
        // for(int i=0;i<len;i++){
        //     if(S.charAt(i)==C){
        //         flag[i] = 1;
        //     }
        // }
        // for(int i=0;i<len;i++){
        //     res[i] = findMin(flag,S,C,i);
        // }
        // return res;
    }
    
    public int findMin(int[] flag, String S, char C, int i) {
        int min = Integer.MAX_VALUE;
        for(int k=0;k<S.length();k++){
            if(S.charAt(k)==C){
                int sub = ((k>i)?k-i:i-k);
                min = ((min>sub)?sub:min);
            }
        }
        return min;
    }
}

