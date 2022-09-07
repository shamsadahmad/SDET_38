package String_Programs;

public class String_Palindrom {

	public static void main(String[] args) {

		String text = "Adda";
		String rev = "";
		for(int i=text.length()-1; i>=0;i--) {
			rev = rev+text.charAt(i);
		}
		if(rev.equals(text)) {
			System.out.println("Its a palindrom");
		}
		else {
			System.out.println("Its not palindrom");
		}
	}
}

