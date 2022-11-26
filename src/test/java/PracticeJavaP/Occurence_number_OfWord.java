package PracticeJavaP;

import java.util.LinkedHashSet;

public class Occurence_number_OfWord {


	public void occurenceOfword() {
		String s = "Tyss is Consultency is Organisation";
		String str[] = s.split(" ");
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			obj.add(str[i]);
		}
		for(String word:obj) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
			System.out.println(word+" "+ count);
		}	
	}
	public static void main(String[] args) {
		Occurence_number_OfWord obj1 = new Occurence_number_OfWord();
		obj1.occurenceOfword();
	}
}


