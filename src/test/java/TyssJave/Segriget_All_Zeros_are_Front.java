package TyssJave;

public class Segriget_All_Zeros_are_Front {

	public static void main(String[] args) {
		int a[]= {1,0,1,1,0,0,1};
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
