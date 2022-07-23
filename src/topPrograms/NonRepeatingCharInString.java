package topPrograms;

import java.util.HashMap;

public class NonRepeatingCharInString {
public static void main(String [] args) {
	String str= "aacdefccb";
	HashMap <Character, Integer> hmap = new HashMap <Character, Integer>();
	int len= str.length();
	for(int i= 0 ; i<=len; i++ ) {
		Character ch= str.charAt(i);
		if(hmap.containsKey(ch)==false) {
			hmap.put(ch, 1);
		}
		else {
			hmap.put(ch, hmap.get(ch)+1);
		}
	}

	for(int i= 0 ; i<=len; i++ ) {
		Character ch= str.charAt(i);
	
	}
}
}
