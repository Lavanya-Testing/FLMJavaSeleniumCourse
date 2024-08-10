package hashmapconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
	
		
		// For creating HashMap Object we need to see the constructor
		
		
		// For creating object we use default constructor
		
		 Map hmap= new HashMap();
		 
		 // we can store the heterogeneous data also in the hashmap
		  hmap.put("Ram",96);
		  hmap.put("ravi", 97);
		  hmap.put("raju", 98);
		  hmap.put("ajmal", 99);
		  hmap.put(12, 96.7895);
		  hmap.put("raju", 100);
		  // if we add same key , it will just override the value
		  hmap.put("ajmal", 101);
		  System.out.println(hmap.size());
		  System.out.println(hmap);
		  
		  
		  
	}

}
