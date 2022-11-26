package PracticeJavaP;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountVowelOfString {
	@Test
	public void countVowelOfString() {
		String s="Pneumonoultramicroscopicsilicovolcanoconiosis";

		
		int count=0;
		for(char ch:s.toCharArray()) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;					
			}
		}
		System.out.println(count);
		
		
//		char str[] = s.toCharArray();
//		int count=0;
//		for(int i=0;i<str.length;i++) {
//			if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u') {
//				count++;					
//			}
//		}
//		System.out.println("No of vowel "+count);

	}

}

