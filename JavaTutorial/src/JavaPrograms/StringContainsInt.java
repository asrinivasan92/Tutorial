package JavaPrograms;

public class StringContainsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "12345a";
		char y[] = x.toCharArray();
		int size = y.length;
		
		int i = 0;
		
		while (i!=size) {
			
			if (y[i]>='0'&& y[i]<='9' ) {
				
			i++;
				
			}
			else {
			 System.out.println("Not an int");
			 System.exit(0);;
			}
			
		}
		 System.out.println("Its an Int");
	}

}
