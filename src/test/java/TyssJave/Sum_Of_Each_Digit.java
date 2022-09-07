package TyssJave;

public class Sum_Of_Each_Digit {

	public static void main(String[] args) {
		// 123 = 1+2+3=6 (O/P)
		int num = 123;
		int sum = 0;
		while(num>0) {
//			num=num%10;
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}
}
