package sorts;

public class insert_sort {

	public static void insert_sort_go(int[]arr) {
		int temp = 0;
		int len = arr.length;
		int j=0;
		//算法的关键是挪动前面的元素
		for(int i = 1; i < len;i++){//排序的趟数
	        temp = arr[i];//赋给temp是为了防止索引i之前的元素向后移动覆盖了索引i的元素
	        j = i-1;
	        for(; j>=0&&arr[j]>temp; --j) {//将大于i位置元素的元素向后移
	            arr[j+1] = arr[j];
	        }
	        arr[j+1]= temp;//找到i应该在的位置，将值放置此处 
	        }
	}
	
	public static void main(String[] args) {
		int[] a = {9,6,3,7,4,2,1};
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println();
		insert_sort_go(a);
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println();
		
	}
}
