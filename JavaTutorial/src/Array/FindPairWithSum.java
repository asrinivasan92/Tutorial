package Array;

public class FindPairWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] a = {10,20,30,40,50};
             int sum= 50;
             for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if (a[j] == sum - a[i]) {
						System.out.println(a[i] + " ," + a[j]);
					
				}
			}
	}

	}
}

// sort the array 
/*
 * while(l<r) { if(a[l]+a[r]>sum) { r--; } else if(a[l]+a[r]<sum) { l++; } else
 * { print pair r--; } }
 */