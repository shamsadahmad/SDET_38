package String_Programs;

public class CountNoOfVowelisPresentinString {

	public static void main(String[] args) {

		String s = "testyantra";
		char[] st = s.toCharArray();
		int count =0;
		for(int i=0; i<st.length; i++) {
			if(st[i]=='a'|| st[i]=='e'|| st[i]=='i'|| st[i]=='o'|| st[i]=='u') {
				count++;
			}
 		}
		System.out.println("no of vowels are "+ count);		
	}
}
