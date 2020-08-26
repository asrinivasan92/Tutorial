package Collections;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Eculidean algorithm
		int no1= 10;
		int no2 = 15;
		System.out.println (gcd(no1, no2 ));
	}


	public static int gcd(int no1, int no2) {
		if (no1==0 || no2==0) {
			return 0;
		}
		if (no1 == no2) {
			return no1;
		}
		if (no1>no2) {
			return gcd(no1-no2,no2);
		}
		else {
			return gcd(no1,no2-no1);
		}



	}

}
