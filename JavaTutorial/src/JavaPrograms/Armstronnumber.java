package JavaPrograms;

public class Armstronnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isarmstrong(153);
	}
	
	public static void isarmstrong(int num) {
		
		int cube = 0;
		int r;
		int t;
		
		t=num;
		
		while (num>0) {
			
			r = num % 10;
			num = num/10;
			cube = cube +(r*r*r);
		}
		if (t==cube) {
			
			System.out.println("Is armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}

}
