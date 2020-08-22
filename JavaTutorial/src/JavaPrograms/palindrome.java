package JavaPrograms;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ispalindrome(151);
		
	}

	public static void ispalindrome(int num) {
		
		int r = 0;
		int sum = 0;
		int t;
		t=num;
		
		while (num>0) {
			
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		
		if (t==sum) {
			
			System.out.println("Is palindrom");
		}
		
		else {
			System.out.println("Not an palindrome");
		}
	}
}
