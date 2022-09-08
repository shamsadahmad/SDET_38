package String_Programs;

import java.util.LinkedHashSet;
// Number of the Accurance in the word ? ex :- "welcome the Banglore Wondrela". 
public class Accurence_NumberOfWord {

	public static void main(String[] args) {
		// Declare the string value 
		String s = "Geeks of Geeks a Computer Science portal is a Geeks";
		// Split the String value and store in a 'sp' Array variable
		String [] sp = s.split(" ");
		// we have to create LinkedHashSet array bcoz maintain insertion order or ignore duplicate value.
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		// create for loop condition add check variable in array and add array Index. 
		for(int i=0; i<sp.length; i++) {
			set.add(sp[i]);
		}
		// create foreachloop and take one by one character and store .
		for(String word : set) {
			int count =0;
			for(int i=0; i<sp.length ; i++) {
				// create if condition and compair word to variable.
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
