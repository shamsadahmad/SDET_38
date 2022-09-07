package String_Programs;

public class Max_Or_Min_Length_Of_String_Array {

	public static void main(String[] args) {

		String s[]= {"Hi","Hello","one","Four","Killer"};
		int min =s[0].length();
		int max = s[0].length();
		for(int i=1 ; i<s.length; i++) {
			
			if(max<s[i].length()) {
				max=s[i].length();
			} else if(min>s[i].length()) {
				min=s[i].length();
			}
		}
		for(int i=0; i<s.length; i++) {
			if(s[i].length()==max) {
			System.out.println(max + " "+ s[i]);
			}
			else if(s[i].length()==min) {
				System.out.println(min + " "+ s[i]);
				}		
		}
	}

}
