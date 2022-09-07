package TyssJave;

public class Add_Two_Array_Elements {

	public static void main(String[] args) {

		int[] a= {3,7,9,13};
		int[] b= {2,4,6};
		
		int length = a.length;
		if(a.length<b.length){
			length=b.length;
		}
		for(int i=0; i<a.length; i++) {
			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				if(a.length<b.length) {
					System.out.println(b[i]);
				}
				else {
					System.out.println(a[i]);
				}
			}
		}
	}

}
