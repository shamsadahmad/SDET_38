package TyssJave;

public class Shifting_the_Last_Positio_in_First_the_Element {

	public static void main(String[] args) {

		int a[]= {2,4,3,6,7,9,8,34,11};
		int key =8;
		
		for(int j=0; j<key; j++) {
			
			int temp = a[0];
			
			for(int i=1; i<a.length; i++) {
				
				a[i-1]=a[i];
			}
			a[a.length-1]= temp;
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
