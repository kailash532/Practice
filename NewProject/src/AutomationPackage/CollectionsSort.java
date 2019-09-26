package AutomationPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> str=new ArrayList<String>();
		str.add("Kailash");
		str.add("Abhilash");
		str.add("Saddam");
		str.add("Mansoor");
		
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Collections.sort(str);
		
		System.out.println("After Sorting the List");
		Iterator<String> itr1=str.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		System.out.println("Sorting in Descending Order");
		
		Collections.reverse(str);;
		Iterator<String> itr2=str.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}

}
