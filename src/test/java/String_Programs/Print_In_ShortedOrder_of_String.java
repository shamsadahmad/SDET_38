package String_Programs;

import java.util.LinkedHashSet;

public class Print_In_ShortedOrder_of_String {

	public static void main(String[] args) {

		String a = "shamsadahmad";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			for(int i=0; i<a.length(); i++) {
				set.add(a.charAt(i));
			}
		for(Character ch:set) {
			for(int i=0;i<a.length();i++) {
				if(ch==a.charAt(i)) {
					System.out.print(ch);
				}
			}
			
		}
	}

}
