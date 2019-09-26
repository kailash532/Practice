package AutomationPackage;

public class BinArrayOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] binArray={1,0,0,1,1,0,0,1};
		int length=binArray.length;
		for(int i=0;i<length;i++){
			
			for(int j=i+1;j<length;j++){
				if(binArray[i]==0){
					
					if(binArray[j]==1){
						int tem=binArray[i];
						binArray[i]=binArray[j];
						binArray[j]=tem;
						break;
					}
					
				}
			}
		}
		
		for(int k=0;k<length;k++){
			System.out.println(binArray[k]);
		}
	}

}
