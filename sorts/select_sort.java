package sorts;


public class select_sort {
	public static void main(String[] args) {
		int[] a = {11,5,9,6,3,7,4,2,1};
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println();
		select_sort_go(a);
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println();
		
	}

	public static void select_sort_go(int[] arr) {
		int min = 0,index = 0;
		for(int i = 0;i<arr.length-1;i++) {
			min = arr[i];
			index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					index = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = min;
		}
	}
}
