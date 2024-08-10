package hashmapconcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
	
		
		// For creating HashMap Object we need to see the constructor
		
		
		// For creating object we use default constructor
		
		 Map<String,Integer> hmap= new HashMap<String,Integer>();
		 
		  hmap.put("Ram",96);
		  hmap.put("ravi", 97);
		  hmap.put("raju", 98);
		  hmap.put("ajmal", 99);
		  Set<String> keys=hmap.keySet();
		  
		   Iterator <String> it=keys.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }
		   
		   
		   Collection<Integer> values=hmap.values();
		   Iterator<Integer> it2=values.iterator();
		   
		   while(it2.hasNext())
		   {
			   System.out.println(it2.next());
		   }
		   
		   // To get entries
		   
		   
		   Set<Entry<String, Integer>>entries=  hmap.entrySet();
		   for(Entry<String, Integer> temp:entries)
		   {
			   System.out.println(temp.getKey()+temp.getValue());
		   }
		   
		  
		  
		  /*Set<Entry<String, Integer>> entries= hmap.entrySet();
		  // Using Foreach loop
		  
		  for(Entry<String,Integer> entry:entries)
		  {
			  System.out.println(entry.getKey()+"____"+entry.getValue());
		  }
		  */
		  //Using Iterator concept
		  
			/*
			 * Set<Entry<String, Integer>> entries=hmap.entrySet(); Iterator<Entry<String,
			 * Integer>>it= entries.iterator(); while(it.hasNext()) { Entry<String, Integer>
			 * entry= it.next();
			 * System.out.println(entry.getKey()+"_____"+entry.getValue()); }
			 * System.out.println(hmap.get("Ram")); System.out.println(hmap.values());
			 */
		  
		  
	}

}
