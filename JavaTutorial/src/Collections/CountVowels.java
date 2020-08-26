package Collections;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "ajith is best actor $$$";
	    char y[]= x.toCharArray();
	    int size = y.length;
	    
	    int vowel = 0;
	    int splchar = 0;
	    int i=0;
	    
	    while (i!=size) {
	    	
	    	if (y[i]>='a' && y[i]<='z' ) {
				
	    		if (y[i]=='a'|| y[i]=='e'|| y[i]=='i'|| y[i]=='o'|| y[i]=='u') {
	    			
					++vowel;
				}
	    		
			}
	    	
	    	else {
	    		
	    		++splchar;
	    	}
	    	
	    	++i;
			
		}
	    
	    System.out.println(vowel);
	    System.out.println(splchar);
		
	}

}
