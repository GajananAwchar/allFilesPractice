package topPrograms;

import java.util.*;

public class Practice {
public static void main(String [] args) {
 String s="i am gajanan i am gajanan";
//String [] ar= s.split(" ");
char [] ar = s.toCharArray();
Map<Character, Integer> l= new LinkedHashMap<Character, Integer>(); 

for(char ss:ar) {
	if(l.containsKey(ss)) {
		l.put(ss, l.get(ss)+1);}
	else {
	l.put(ss, 1);	
	}	
	}
for(Map.Entry<Character, Integer> entry: l.entrySet()) {
	System.out.println(entry.getKey()+" "+ entry.getValue());
	
}
}
}

