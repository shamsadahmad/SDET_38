package String_Programs;

import java.util.Scanner;

public class ReverseAsString {

	public static void main(String[] args) {
		String s ="tester";
		char[] str = s.toCharArray();
		for(int i=str.length-1; i>=0; i--) {
			System.out.print(str[i]);
		}
		
//	First Way 1.	
//		 String s="tester";
//		 String reverse="";
//	        for(int i=s.length()-1;i>=0;i--)
//	        {
//	            reverse = reverse+s.charAt(i);
//	        }
//	        System.out.print("Reverse string is ");
//	        System.out.print(reverse);
//	    }
			
//	Another way 3
//	String s = "tester";
//		for(char ch='a';ch<='z'; ch++) {
//			System.out.println(ch);
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String");
//		String s=sc.nextLine();
//		char arr[] =s.toCharArray();
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(s.charAt(i));
//		}
	}
}