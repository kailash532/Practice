package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringExample3 {
	
	public void findDuplicates(String str) {
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		int len=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<len;i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}else {
				map.put(ch[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			if(mp.getValue()>1) {
			System.out.println(mp.getKey() +":"+mp.getValue());
			}
		}
		
		
		
		
	}
	
	public void dups(String str) {
		
		int len=str.length();
		
		char[] ch=str.toCharArray();
		String str2="";
		int i =0;
		while(len>0) {
			String st=String.valueOf(ch[i]);
			str=str.replaceAll(st, "");
			int len2=len-str.length();
			if(len2>1) {
				System.out.println(ch[i]+":"+len2);
			}
			len=str.length();
			i=i+1;
			
		}
		
		
	}
	
	public void dups2(String str) {
		
		
		char[] ch=str.toCharArray();
		ArrayList<Character> arr=new ArrayList<>();
		for(char c:ch) {
			arr.add(c);
		}
		Object[] c2=arr.toArray();
		System.out.println(Arrays.toString(c2));
		
		HashSet<Character> has=new HashSet<>(arr);
		
		for(char ct:has) {
			if(Collections.frequency(arr, ct)>1) {
			System.out.println(ct +":" +Collections.frequency(arr, ct));
			}
		}
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="permissionn";
		StringExample3 str3=new StringExample3();
		str3.dups2(s);
	}

}
