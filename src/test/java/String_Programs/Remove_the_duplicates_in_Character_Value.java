package String_Programs;

import java.util.LinkedHashSet;

public class Remove_the_duplicates_in_Character_Value {

	public static void main(String[] args) {

		String text = "tester";
//		String str = text.toLowerCase();
//use LinkedhashSet because maintain insertion order or no duplicated value allowed
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
		for(int i=0;i<text.length();i++) {
			
			set.add(text.charAt(i));
		}
		for(Character ch: set) {
			int count=0;
			for(int i=0;i<text.length(); i++) {
				if(ch==text.charAt(i)) {
					count ++;
				}
			}
			System.out.println(ch+" "+count);
		}
		
		
	}

}
