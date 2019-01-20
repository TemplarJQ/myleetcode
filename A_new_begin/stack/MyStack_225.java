class MyStack {

    //总结起来就是，得让另一个队列不停地接受要出栈元素前面的元素直到目标元素出栈
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    
    private boolean flag;
    
    private int lastOne;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        flag = true;
        lastOne = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(flag){
            queue1.offer(x);
            lastOne = x;
        }else{
            queue2.offer(x);
            lastOne = x;
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(flag){
            int temp = 0;
            while(queue1.peek()!=null){
                temp = queue1.poll();
                if(queue1.peek()==null){
                    break;
                }else{
                    queue2.offer(temp);
                    lastOne = temp;
                }
            }
            flag = false;
            return temp;
        }else{
            int temp = 0;
            while(queue2.peek()!=null){
                temp = queue2.poll();
                if(queue2.peek()==null){
                    break;
                }else{
                    queue1.offer(temp);
                    lastOne = temp;
                }
            }
            flag = true;
            return temp;
        }
    }
    
    /** Get the top element. */
    public int top() {
        return lastOne;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.peek()==null&&queue2.peek()==null;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
