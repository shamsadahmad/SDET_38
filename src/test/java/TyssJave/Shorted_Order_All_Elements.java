package TyssJave;

public class Shorted_Order_All_Elements {

	public static void main(String[] args) {
		
		int a[] = {56,12,43,50,30,11};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j = i+1; j < a.length; j++) {
				
		 		if(a[i]>a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]= temp;					
				}				
			}
			System.out.print(a[i]+" ");
		}
	}

}
