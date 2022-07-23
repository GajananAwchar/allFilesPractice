package topPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultiValueToSingleKey {
public static void mapPractice() {
	/* program to assign multiple values to single key
	used :- here Stick with the standard APIs
	 and add a collection class like a ‘Vector’ or ‘ArrayList’ to your map or set.
	*/
	Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	map.put("ford" ,new ArrayList<String>());
	map.get("ford").add("Fiesta");
	map.get("ford").add("Figo");
	map.get("ford").add("OutLander");
	map.get("ford").add("FT");
	map.put("TATA" ,new ArrayList<String>());
	map.get("TATA").add("Tiyago");
	map.get("TATA").add("Indica");
	map.get("TATA").add("BOlt");
	map.get("TATA").add("Nexon");	
	System.out.println(map);
}
	public static void main(String [] args) {
	mapPractice();
}
}
