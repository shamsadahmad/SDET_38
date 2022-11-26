package String_Programs;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		String s1="hi";
		String s2="hello";
		String s3="hihello";
		
		if(num%3==0 && num%5==0) {
			System.out.println(s3);
		}
		else if (num%5==0) {
			System.out.println(s2);
		}
		else if(num%3==0) {
			System.out.println(s1);
		}
	}

}
