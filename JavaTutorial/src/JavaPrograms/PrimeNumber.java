package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isprime(17));
		
	}
	
	public static boolean isprime(int num) {
		
		if (num<=1) {
			
			return false;
		}
		
		for (int i = 2; i < num; i++) {
			if (num % i==0) {
				
				return false;
				
			}
		}
		
		return true;
	}

}
 