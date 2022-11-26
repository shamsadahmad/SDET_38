package String_Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateStringValue {

	public static void main(String []arg) {
		String s="Greek is Greek";
		String str[] = s.split(" ");
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			obj.add(str[i]);
		}
		for(String str1:obj) {
			System.out.println(str1);
		}
	}
}
