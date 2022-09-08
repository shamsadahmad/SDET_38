package String_Programs;

public class Reverse_the_given_Words {

	public static void main(String[] args) {

		String s="this is the test yantra";
		String str[] = s.split(" ");

		for(int i=0; i<str.length; i++) {

			String st=str[i];
			
//			for(int j=0; j<st.length(); j++) 
			
			for(int j=st.length()-1; j>=0; j--) {
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}

	}
}
