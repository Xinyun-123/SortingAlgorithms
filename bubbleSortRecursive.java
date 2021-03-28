
public class bubbleSortRecursive {
	public static void main(String[]args) {
		int[] arr = {3,2,1,8};
		sort(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sort(int[]arr,int n) {
		if(n==1)
			return;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		sort(arr,n-1);
		
	}
}
