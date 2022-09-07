package TyssJave;

public class Traversing_All_Zeroes {

	public static void main(String[] args) {

		int a[] = {2,3,0,4,0,0,1,0};
		
		int b[]=new int[a.length];
		int n=0;
		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==0) {
//				b[n++]=a[i];
//				System.out.print(a[i]+" ");
//			}
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]!=0) {
//				b[n++]=a[i];
//				System.out.print(a[i]+" ");
//			}
//		}
//		
		
		int count = 3;
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)
				count++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)
				count++;
		}
				
	
		
//		for(int i=0; i<a.length; i++) {
//			if(a[i]==0) {
//				System.out.print(a[i]+" ");
//			}
//		}
//		for(int i=0; i<a.length; i++) {
//			if(a[i]!=0) {
//				System.out.print(a[i]+" ");
//			}
//		}
	}

}
