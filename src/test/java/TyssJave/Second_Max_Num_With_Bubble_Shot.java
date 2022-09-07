package TyssJave;

public class Second_Max_Num_With_Bubble_Shot {

	public static void main(String[] args) {

		int a[] = {501,500,77,12,44,350,4,50,499};
		
		int Fmax = 0;
		int Smax = 0;
		
		for(int i=0; i<a.length; i++) {
			if(Fmax<a[i]) {
				Smax =Fmax;
				Fmax = a[i];
			}
			else if(Smax<a[i]) {
				Smax = a[i];
			}
		}
		System.out.println(Fmax);
		System.out.println(Smax);
	}

}
