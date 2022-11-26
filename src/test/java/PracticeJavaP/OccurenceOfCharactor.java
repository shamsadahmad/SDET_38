package PracticeJavaP;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class OccurenceOfCharactor {
	@Test
	public void occurenceOfChar() {
		
		String s="Pneumonoultramicroscopicsilicovolcanoconiosis";
//		System.out.println(s.length());
		char[] cr = s.toCharArray();
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();
		for(int i=0;i<cr.length;i++) {
			obj.add(cr[i]);
		}
		for(Character Char:obj) {
			int count =0;
			for(int i=0;i<cr.length;i++) {
				if(Char==cr[i]) {
					count ++;
				}				
			}
//			System.out.println(count);
			System.out.println(Char+" "+count);
		}
	}
}
