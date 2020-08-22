package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"java","ruby","Python", "java","ruby"};
		
		//For loop
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("The repeated number is " + names[i]);
				}
			}
		}
		
		//HashSet 
		
		  Set<String> store = new HashSet<String>();
		  for (String name : names) {
		    
			  if (store.add(name)== false) {
				
				  System.out.println("The duplicate number is "+ name);
			}
		}
		  
		  //HashMap
		  
		  Map<String,Integer> wordcount = new HashMap<String,Integer>();
		  for (String name : names) {
			Integer count = wordcount.get(name);
			  if (count==null) {
				wordcount.put(name, 1);
			}
			  else {
				  wordcount.put(name,++count);
			  }
		}
		  //Change to Set to Iterate
		  Set<Entry<String,Integer>> name1 = wordcount.entrySet();
		  for (Entry<String, Integer> name2 : name1) {
			if (name2.getValue()>1) {
				System.out.println("Duplicate is " + name2.getKey());
			}
		}
	}

}
