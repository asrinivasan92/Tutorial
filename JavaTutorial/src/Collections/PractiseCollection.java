package Collections;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class PractiseCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
          isduplicate("He is a developer and a coder java java");
	}
	
	public static void isduplicate(String InputString) {
		
		String word[] = InputString.split(" ");
		
		//Map
		
		Map<String,Integer> store = new HashMap<String,Integer>();
		
		for (String name : word) {
			
			if (store.containsKey(name)) {
				
				store.put(name, store.get(name)+1);
			}
			else {
				store.put(name, 1);
			}
				
		}
		
    	//Print all 
		  Set<String> name2 = store.keySet();
		  for (String name3 : name2) {
			if (store.get(name3)>1) {
				System.out.println(name3 +" Duplicate is " + store.get(name3));
			}
		}
	}
}
