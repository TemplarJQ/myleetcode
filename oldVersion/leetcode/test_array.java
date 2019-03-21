package leetcode;

public class test_array<T> {
	
	T value;
	
	test_array(T value) {  
        this.value = value;  
    }
	
		public static void main(String[] args) {
			
			test_array<Integer> eArray = new test_array<Integer>(2);
			
			Class class1 = eArray.getClass();
			System.out.println("name: "+class1.getName());
			System.out.println("typename: "+class1.getTypeName());
			System.out.println("toString: "+class1.toString());
			
			
			
			
//			int[] test = {1,2,4,5};
//			for(int i:test) {
//				System.out.print(i+"--");
//			}
//			System.out.println();
//			int[] change = test;
//			change[2] = 33;
//			for(int i:test) {
//				System.out.print(i+"--");
//			}
		}
}
