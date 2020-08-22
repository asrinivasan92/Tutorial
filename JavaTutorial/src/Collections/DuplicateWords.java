package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        isduplicate(" He is a developer and a coder java java");
	}
	
	public static void isduplicate(String Inputstring) {
		
		//split
		String words[] = Inputstring.split(" ");
		
		//HashMap
		Map<String,Integer> wordcount = new HashMap<String,Integer>();
		
		for (String Word1 : words) {
			if (wordcount.containsKey(Word1)) {
				
				wordcount.put(Word1 ,wordcount.get(Word1)+1);
			}
			else {
				wordcount.put(Word1 , 1);
			}
		}
		
		//Set to Iterate 
		
		Set<String> word2 = wordcount.keySet();
		
		for (String word3 : word2) {
			if (wordcount.get(word3)>1) {
				System.out.println(word3 +":"+ wordcount.get(word3));
			}
		}

     }
}
