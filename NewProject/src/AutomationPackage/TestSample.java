package AutomationPackage;

import java.util.HashMap;
import java.util.Map;

public class TestSample {
	
	public void StringCount(String str) {
		
		int length=str.length();
		char[] ch=str.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<length;i++) {
			
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i),1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> ma :map.entrySet()) {
			System.out.println(ma.getValue()+""+ma.getKey());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str="AAAABBBCC";
		
		TestSample ts=new TestSample();
		ts.StringCount(Str);

	}

}
