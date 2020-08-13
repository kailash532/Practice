package Interview;

import java.util.HashMap;
import java.util.HashSet;

public class Test1 {
	
	
	public void sequenceRepetation(String st) {
		
		int len=st.length();
		 HashMap<Character, Integer> map=new HashMap<>();
		 HashMap<Character, Integer> position=new HashMap<>();
		char[] ch=st.toCharArray();
		
		for(int i=0;i<len;i++) {
			if(map.containsKey(ch[i])) {
				if(position.containsKey(ch[i]) && position.get(ch[i])+1==i) {
				map.put(ch[i], map.get(ch[i])+1);
				}
			}else
			{
				position.put(ch[i], i);
				map.put(ch[i], 1);
			}
			
		}
		
	}
	
	public void testseq(String st) {
		
		HashSet<Character> hash=new HashSet<>();
		for(int i=0;i<st.length();i++) {
			hash.add(st.charAt(i));
		}
		System.out.println(hash);
		HashMap<Character, Integer> map=new HashMap<>();
		char[] ch=st.toCharArray();
		char lastchar='#';
		int count=0;
		for(char c:ch) {
			
			if(lastchar==c ) {
				if(map.containsKey(c))
					count=count+1;
				map.put(c, map.get(c)+1);
			}else {
				lastchar=c;
				count=1;
				if(!map.containsKey(c))
				map.put(c, 1);
				if(count<2)
					map.put(c, 1);
				
			}
		}
		System.out.println(map);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="AAABCDCDCBCCCCCDD";
		Test1 ts=new Test1();
		ts.testseq(str);
		//A=3,B=0,D=2,C=5
	}

}
