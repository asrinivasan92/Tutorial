package Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] a = {2,1,5,4,6,8,6};
           
           Arrays.sort(a);
           
           for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
