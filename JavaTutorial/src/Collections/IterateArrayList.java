package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> tvseries = new ArrayList<String>();
		
		tvseries.add("Tenet");
		tvseries.add("MoneyHeist");
		tvseries.add("Tenet2");
		
		//Java8 Lambda Expression
		tvseries.forEach(shows ->{
		System.out.println(shows);
		}
		);
	    System.out.println("**************************************");
	    
		//Iterator
          Iterator<String> it= tvseries.iterator();
          
          while (it.hasNext()) {
			System.out.println(it.next());
		}
        System.out.println("**************************************");
        
        //forloop
        
        for (int i = 0; i<tvseries.size() ; i++) {
			
        	System.out.println(tvseries.get(i));
		}
	}
}
