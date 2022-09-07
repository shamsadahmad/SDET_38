package TyssJave;

public class Sum_of_First_Three_Number {

	public static void main(String[] args) {

		int a[]= {44,34,22,55,11,32,13};
		
		for(int i=0; i<a.length; i++) {	
			int sum=0;
			for(int j=0; j<3; j++) {
				sum =sum+a[j];
			}
			System.out.println(sum);
		}
	}
}

