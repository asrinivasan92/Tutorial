package Collections;

public class SortAscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,6,8,9,5,7,3,2,10};
		int i,j,temp;

		System.out.println("Input: ");

		for ( i = 0; i < a.length; i++) {

			System.out.print(" " + a[i]);
		}
		System.out.println(" ");
		System.out.println("Output: ");
		for (i = 0; i < a.length; i++) {

			for (j = i+1; j < a.length; j++) {

				if (a[i]>a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for ( i = 0; i < a.length; i++) {

			System.out.print(" " + a[i]);
		}
	}

}
