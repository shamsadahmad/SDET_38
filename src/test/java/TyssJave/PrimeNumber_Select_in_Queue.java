package TyssJave;

public class PrimeNumber_Select_in_Queue {
	//i am integrating the same logic inside the loop.
	public static void main(String[] args) {
		int a[] = {2,4,3,5,6,7,8,9,1};   
		for(int j=0; j<a.length; j++) {
			int n=a[j];

			int i=2;
			while(true) {
				if(n%i==0) {
					break;				
				}
				else 
				{
					i++;
				}
			}
			if(i==n) {
				System.out.print(a[j]+" ");
			}
		}
	}
}
