package String_Programs;

import org.w3c.dom.Text;

public class CountVowelIsString {

	public static void main(String[] args) {

		String txt = "Jamie ECommerce Info";
		int count=0;
		for(char ch:txt.toCharArray()) {
			ch=Character.toLowerCase(ch);
//			ch=Character.toUpperCase(ch);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
			else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}System.out.println(count);
		
	}

}
