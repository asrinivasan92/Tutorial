package Collections;

public class DistinctArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int a[] = {4,5,6,6,7,7,8,9,10,10};
			for (int i = 0; i < a.length; i++) {
				
				for (int j = i+1; j < a.length; j++) {
					
					if (a[i]==a[j]) {
						
						System.out.println("Unique number is " + a[i]);
					}
					
				}
			}
	}

}
