package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class PractiseCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isduplicate(" He is a developer and a coder java java");
	}
	
	public static void isduplicate(String InputString) {
		
		String words[] = InputString.split(" ");
		
		//Map
		HashMap<String,Integer> wordcount = new HashMap<String,Integer>();
		for (String word : words) {
			if (wordcount.containsKey(word)) {
				
				wordcount.put(word, wordcount.get(word)+1);
				
			} else {
				
				wordcount.put(word, 1);
			}
		}
		
		Set<String> word1 = wordcount.keySet();
		for (String word2 : word1) {
			if (wordcount.get(word2)>1) {
				System.out.println(word2 +":"+ wordcount.get(word2));
			}
		}
	}

}
