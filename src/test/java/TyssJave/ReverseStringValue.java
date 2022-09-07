package TyssJave;

public class ReverseStringValue {

	public static void main(String[] args) {
		String s = "india";
		
		char[] str = s.toCharArray();
		int l = s.length();
		for(int i=l-1; i>=0; i--) {
			System.out.print(str[i]);
		}	 
	}

}
