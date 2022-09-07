package String_Programs;

import java.util.LinkedHashSet;

public class OrderOfAccurenceOfEachCharacter {

	public static void main(String[] args) {

		String text = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<text.length(); i++) {
			set.add(text.charAt(i));
		}
		for(Character ch: set) {
			for(int i=0; i<text.length(); i++) {
				if(ch==text.charAt(i)) {
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
		}
	}

}
