package PracticeJavaP;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountVowelAfterRemoveDuplicate{
	@Test
	public void removeDuplicateVowelinString() {
		String text = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();   

		for(int i=0;i<text.length();i++) {
			set.add(text.charAt(i));
		}
		int count=0;
		for(Character ch:set) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
				}
			}
		System.out.println(count);
		}
	}

//	for(int i=0;i<text.length();i++) {	
//		set.add(text.charAt(i));
//	}
//	for(Character ch: set) {
//		int count=0;
//		for(int i=0;i<text.length(); i++) {
//			if(ch==text.charAt(i)) {
//				count ++;
//			}
//		}
//		System.out.println(ch+" "+count);
//	}

//	Remove Vowel in String

//		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";
//		System.out.println("String is :- "+ s);
//		String remVowel = s.replaceAll("[AaEeIiOoUu]", "");
//		System.out.println(remVowel);

//	}
//}
