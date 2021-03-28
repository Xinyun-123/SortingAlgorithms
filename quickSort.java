
public class quickSort {
	public static void main(String [] args) {
		int[] arr = {5,3,10,4};
		sort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void sort(int[] arr, int l, int h) {
		if(l<h) {
			int p = partition(arr,l,h);
			sort(arr,l,p-1);
			sort(arr,p+1,h);
		}
	}
	
	public static int partition(int[] arr, int l, int h) {
		int p = arr[h];
		int i = l;
		for(int j=l;j<h;j++) {
			if(arr[j]<=p) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i]=arr[h];
		arr[h]=temp;
		return i;
	}
	
}
