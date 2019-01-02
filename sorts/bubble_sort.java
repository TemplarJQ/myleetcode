package sorts;

public class bubble_sort {
	public static void main(String[] args) {
		int[] a = {9,6,3,7,4,2,1};
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println();
		bubble_sort_go(a);
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr,int a,int b) {
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void bubble_sort_go(int[] arr) {
		for(int i = arr.length;i>0;i--) {
			for(int j = 0;j<(arr.length-1);j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	/*public static void bubbleSort(int[] array){
        if (array == null) return;
        int len = array.length;;
        for(int i = 0; i < len-1; i++){
            for (int j = len-1; j > i; j--){
                if (array[j] < array[j-1] ){
                    swap(array,j,j-1);
                }
            }
        }
    }*/

}
