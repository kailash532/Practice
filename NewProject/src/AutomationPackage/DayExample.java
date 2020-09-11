package AutomationPackage;

import java.util.HashMap;
import java.util.Map;

public class DayExample {

	public String getKeyvalue(HashMap<String, Integer> map,int value) {
		String key="";
		for(Map.Entry<String, Integer> mp:map.entrySet()) {
			if(mp.getValue().equals(value)) {
				key=	mp.getKey();
			}
		}
		return key;
		
	}
	public String dayOfTheWeek(String day,int num) {
		
		
		HashMap<String, Integer> days=new HashMap<String, Integer> ();
		
		days.put("Mon", 1);
		days.put("Tue", 2);
		days.put("Wed", 3);
		days.put("Thr", 4);
		days.put("Fri", 5);
		days.put("Sat", 6);
		days.put("Sun", 7);
		
		
		
		
		int temp=0;
		if(num<0 || !days.containsKey(day)) {
			return "Invalid Day ";
		}
	
		int dayposition=days.get(day);
		
			temp=dayposition+num;
		
		if(temp>0 && temp<7) {
			
			
			day=getKeyvalue(days, temp);
			
		}else {
			temp=temp%7;
			day=getKeyvalue(days, temp);
		}
		
		
		
		return day;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayExample dt=new DayExample();
		
		System.out.println(dt.dayOfTheWeek("Sat", 1));
	}

}
