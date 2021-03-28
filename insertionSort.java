
public class insertionSort {
	public static void main(String [] args) {
		int[] arr = {5,6,0,4};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int key =arr[i+1];
			while(i>=0 && arr[i]>key) {
				arr[i+1]=arr[i];
				i-=1;
			}
			arr[i+1]=key;
		}
	}
}
