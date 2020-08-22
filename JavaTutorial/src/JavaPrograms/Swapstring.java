package JavaPrograms;

public class Swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Byte";
		String b = "BGT";
		
		a = a + b;
		b = a.substring(0, 4);
		a= a.substring(4, 7);
		System.out.println(a);
		System.out.println(b);
	}

}
