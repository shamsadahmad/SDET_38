package String_Programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OrderOfAccuringTheLastPosition {

	public static void main(String[] args) {
		// Input take User
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any String Value");
//		String text = sc.next();
		
		// Input we can define 
		String text = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<text.length(); i++) {
			set.add(text.charAt(i));
		}
		for(Character ch: set) {
			for(int i=text.length()-1;i>=0; i--) {
				if(ch==text.charAt(i)) {
					System.out.println(ch+"="+(i+1));
					break;
				}
			}
		}
		
	}

}
