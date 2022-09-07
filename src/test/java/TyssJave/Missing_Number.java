package TyssJave;

public class Missing_Number {

	public static void main(String[] args) {

		int a[] = {1,2,4,5,7,10};
		
		for(int i=0; i<a.length-1; i++) {
			
			int n=a[i+1]-a[i];
			int count =1;
			while(n>1) {
				System.out.print(a[i]+count);
				count++;
				n--;
			}
		}
	}
}


// int a[]= {1,2,4,5,7,10};
// for(int i=0; a.length; i++){
// int n= a[i+1]-a[i];
// while(n>1){
//	system.out.println(a[i]+count);
// count ++;
// n--;
