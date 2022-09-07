package TyssJave;

public class Palindrom_Number {

	public static void main(String[] args) {

		int num = 121;
		int temp=num ;
		int rem=0, rev=0;
		
		while(num!=0) {
			rem= num%10;
			rev =rev*10+rem;
			num =num/10;
		}
		if(temp==rev) {
			System.out.println(rev+" It should be Palindrom");
		}
	}

}
