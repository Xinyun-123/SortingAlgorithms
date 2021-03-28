
public class mergeSort {
	public static void main(String[]args) {
		int[] arr = {2,6,9,8};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void sort(int[] arr,int s, int e) {		//s is the index of the start element; e is the index of the end element
		int m = (s+e)/2;									//m is the index of the middle element
		if(s<e) {
			sort(arr,s,m);
			sort(arr,m+1,e);
			merge(arr,s,m,e);
		}
	}
	
	public static void merge(int[] arr, int s, int m, int e) {
		int[] a = new int[m-s+1];
		int[] b = new int[e-m];
		for(int i=0;i<a.length;i++) {
			a[i] =arr[s+i];
		}
		for(int j=0;j<b.length;j++) {
			b[j]=arr[m+1+j];
		}
		
		int index1=0, index2=0;

		while(index1<a.length && index2<b.length) {
			if(a[index1]<b[index2]) {
				arr[s] =a[index1];
				s++;
				index1++;
				
			}else {
				arr[s]=b[index2];
				s++;
				index2++;
			}
		}
		
		while(index1<a.length) {
			arr[s]=a[index1];
			s++;
			index1++;
		}
		
		while(index2<b.length) {
			arr[s]=b[index2];
			s++;
			index2++;
		}
	}
}
