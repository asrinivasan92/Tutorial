package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,5,4,2,1,4,7};
		
		//Hasset 
		
				Set names = new HashSet();
				for (int b : a) {
					if (names.add(b)==true) {
						System.out.println(b);
					}
				}
				//map 
				
				Map<Integer,Integer> word = new HashMap();
				
				for (int c : a) {
					Integer count = word.get(c);
					if (count==null) {
						word.put(c, 1);
					}
					else {
						word.put(c, ++count);
					}
				}
				
				 Set<Entry<Integer,Integer>> name = word.entrySet();
				  for (Entry<Integer, Integer> name2 : name) {
					if (name2.getValue()==1) {
						System.out.println("Non Duplicate is " + name2.getKey());
					}
				}
	}

}
