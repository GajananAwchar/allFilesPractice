package stringPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementByHashMap {
	
	public static void main(String[] args) {
		String names [] ={"ab","bc","ab","cd"};
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name:names) {
			Integer count = storeMap.get(name);
			if( count==null) {
				storeMap.put(name, 1);}
				else{
					storeMap.put(name, ++count);
				}
			} 
		}
	}
