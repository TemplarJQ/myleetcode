package sorts;

public class insert_sort {

	public static void insert_sort_go(int[]arr) {
		int temp = 0;
		int len = arr.length;
		int j=0;
		//�㷨�Ĺؼ���Ų��ǰ���Ԫ��
		for(int i = 1; i < len;i++){//���������
	        temp = arr[i];//����temp��Ϊ�˷�ֹ����i֮ǰ��Ԫ������ƶ�����������i��Ԫ��
	        j = i-1;
	        for(; j>=0&&arr[j]>temp; --j) {//������iλ��Ԫ�ص�Ԫ�������
	            arr[j+1] = arr[j];
	        }
	        arr[j+1]= temp;//�ҵ�iӦ���ڵ�λ�ã���ֵ���ô˴� 
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
