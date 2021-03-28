
public class selectionSort {
	public static void main(String[]args) {
		int[] arr = {3,14,2,6};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sort(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					index=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
	}
}
