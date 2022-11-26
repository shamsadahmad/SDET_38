package TyssJave;

public class Max_NUM_With_BubbluShot {

	public static void main(String[] args) {

		int a[] = {20,30,12,11,43,23,2};
		
		int max =a[0];
		for(int i=1; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
