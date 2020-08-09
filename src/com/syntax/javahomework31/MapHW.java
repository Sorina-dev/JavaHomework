package com.syntax.javahomework31;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Create a map of a building. Store floor number and it is associated company name. 
 * (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
Check how many entries you have?

Update company on a 4th floor 

Remove company on the 7th floor

Print your map
 */
public class MapHW {
 public static void main(String[] args) {
	
	 Map <Integer, String> building =  new LinkedHashMap<>();
	 building.put(1,"Google");
	 building.put(2, "Amazon");
	 building.put(3, "Facebook");
	 building.put(4, "Amazon");
	 building.put(1, "Google");
	 building.put(5, "Google");
	 building.put(6,"Syntax");
	 
	 System.out.println("There are " + building.size() + "entries");
	 System.out.println(building);
	 building.put(4, "Instagram");
	 System.out.println("After updating the 4 key "+ building);
	 building.remove(7);
	 System.out.println("After removing the 7 key "+ building);
	 building.remove(6);
	 System.out.println("After removing the 6 key "+ building);
	 
}
}
