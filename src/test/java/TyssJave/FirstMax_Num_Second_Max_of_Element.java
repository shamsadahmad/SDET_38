package TyssJave;

public class FirstMax_Num_Second_Max_of_Element {

	public static void main(String[] args) {

		int a[]= {1,5,55,32,4,62,22};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			} 
		}
		System.out.println("first max num is "+ a[0]);
		System.out.println("Second max num is "+ a[1]);
	}

}
