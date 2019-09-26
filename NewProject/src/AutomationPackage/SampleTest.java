package AutomationPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class SampleTest {
	
	public static int numofPrizes(int k, List<Integer> marks) {
	    // Write your code here
	ArrayList<Integer> marks_ranks=new ArrayList<Integer>();
	
	    int len=marks.size();
	    Collections.sort(marks);
	    Collections.reverse(marks);
	   
	    int rank=1;
	    int ranksCount=0;
	    int samerank=0;
	for(int i=0;i<len;i++){
		for(int j=i+1;j<len;j++){
			
		

	if(marks.get(i)>marks.get(j)){
	marks_ranks.add(rank);
	rank=rank+1+samerank;
	}else if(marks.get(i)==marks.get(j)){
	marks_ranks.add(rank);
	samerank=samerank+1;
	}
	
	}
	}
	for(int j=0;j<marks_ranks.size();j++){
	if(marks_ranks.get(j)<=k){
	    ranksCount++;
	}
	}
	return ranksCount;
	}

	   


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleTest s=new SampleTest();
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(10);
		arr.add(60);
		arr.add(60);
		arr.add(70);
		arr.add(70);
		System.out.println(s.numofPrizes(4, arr));
	}

}
