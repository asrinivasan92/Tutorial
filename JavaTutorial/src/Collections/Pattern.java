package Collections;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String S = "Java";
		
		for (int i = 1; i <=4; i++) {
			
			for (int j = 1; j <=4; j++) {
				
				/*
				 * if ((i+j)%2==0) { System.out.print("1 "); } else { System.out.print("0 "); }
				 */
				/* System.out.print("* "); */
				if (j<i) 
					System.out.print(" ");
				else
				System.out.print(S.charAt(j-1) + " ");
				
			}
			System.out.println("");
			
		}
	}

}
