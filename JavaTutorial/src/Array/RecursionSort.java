package Array;

public class RecursionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {6,4,1,2,5};
      //bubblesort(arr);
      recursivesort(arr,arr.length);
     
      for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

	
	public static void bubblesort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-1-i; j++) {
				
				if (arr[j] > arr[j+1]) {
	                int temp = arr[j];				
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
public static void recursivesort(int[] arr, int n) {
		
		if (n==1) {
			return;
		}
			for (int j = 0; j < n-1; j++) {
				
				if (arr[j] > arr[j+1]) {
	                int temp = arr[j];				
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			recursivesort(arr,n-1);
		}
             
}
