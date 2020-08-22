package JavaPrograms;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,40,50,900};
		
		int largest = a[0];
		int smallest= a[0];
		
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i]>largest) {
				largest = a[i];
			} else if(a[i]<smallest) {
                smallest = a[i];
			}
		}
			
        System.out.println(largest);
        System.out.println(smallest);
      }
}
