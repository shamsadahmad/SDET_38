package String_Programs;

import java.util.LinkedHashSet;
// Number of the Accurance in the word ? ex :- "welcome the Banglore Wondrela". 
public class Accurence_NumberOfWord {

	public static void main(String[] args) {
		String s = "Geeks of Geeks a Computer Science portal is a Geeks";
		
		String [] sp = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<sp.length; i++) {
			set.add(sp[i]);
		}
		for(String word : set) {
			int count =0;
			for(int i=0; i<sp.length ; i++) {
				if(word.equals(sp[i])) {
					count ++;
				}
			}
			System.out.println(word + " " + count);
		}
	}

}
	
		
		
	












//		
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for(int i=0; i<s.length(); i++) {
//			set.add(s.charAt(i));			
//		}
//		for(Character ch :set) {
//			int count =0;
//			for(int i=0; i<s.length(); i++) {
//				if(s.charAt(i)==ch) {
//					count++;
//				}
//			}
//			System.out.println(ch+ "" + count + "");
//		}
