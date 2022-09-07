package String_Programs;

import java.util.LinkedHashSet;

public class Duplicate_Char_in_String {

	public static void main(String[] args) {

		String s = "SHASSI";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}
		for(Character ch : set) {
			int count =0;
			for(int i=0; i<s.length(); i++) {

				if(s.charAt(i)==ch) {
					count ++;
				}
			}
				if(count==1) {
					System.out.println(ch+" "+count);
				}
			}
		}
}


