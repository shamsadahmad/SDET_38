package String_Programs;

import java.util.LinkedHashSet;

public class HowManyTimeWordRepeating {

	public static void main(String[] args) {

		String wrd = "Geeks is the Geeks";
		String[] str=wrd.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
			for(int i=0; i<str.length; i++) {
				set.add(str[i]);
			}
		for (String strr : set) {
			int count =0;
			for(int i=0;i<str.length; i++) {
				if(strr.equals(str[i])) {
					count++;
				}
			}
			System.out.println(strr+ " is repeating "+ count);
		}
	}
}
