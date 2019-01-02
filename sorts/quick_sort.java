package sorts;


public class quick_sort {
	
	
	public static int part(int[] arr, int low, int high) {
		int temp = arr[low];
		while(low<high) {
			while(arr[high]>temp&&high>low) {
				high--;
			}
			arr[low] = arr[high];
			while(arr[low]<temp&&low<high) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[high] = temp;
		return high;
	}
	
	public  static void quick_sort_go(int[] arr,int low,int high) {
		if(low>=high) {return ;}
		int mid = part(arr,low,high);
		quick_sort_go(arr, low, mid -1);
		quick_sort_go(arr, mid+1, high);
	}
	
	public static void main(String[] args) {
		int[] a = {6,3,7,4,2,1};
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		quick_sort_go(a,0,a.length-1);
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}

}
