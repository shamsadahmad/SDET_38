package String_Programs;

import java.util.LinkedHashSet;

public class RemoveTheDuplicatesWordInTheGiverString {

	public static void main(String[] args) {

		String wrd = "Geeks is the Geeks";
		String[] str=wrd.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);
		}
		for (String strr : set) {
			System.out.println(strr+ " ");
		}
	}
}


