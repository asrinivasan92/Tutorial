package JavaPrograms;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
		System.out.println(isfactorial(5));
	}

	public static int isfactorial(int num) {
		
		int fact = 1;
		 
		for (int i = 1; i<=num; i++) {
			
			fact = fact * i;
			
		}
		return fact;
	}
}
