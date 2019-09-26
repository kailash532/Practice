package AutomationPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicates {
	
	public void duplicatesCount(String name){
		char[] c=name.toCharArray();
		LinkedHashMap<Character, Integer> dups=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<c.length;i++){
			
			if(dups.containsKey(c[i])){
				dups.replace(c[i], dups.get(c[i])+1);
			}else{
				dups.put(c[i], 1);
			}
		}
		
		Map.Entry<Character, Integer> maxEntry = null;

		for (Map.Entry<Character, Integer> entry : dups.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		System.out.println(maxEntry);
		System.out.println(dups);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Duplicates d=new Duplicates();
d.duplicatesCount("dfasbceefs");
	}

}
