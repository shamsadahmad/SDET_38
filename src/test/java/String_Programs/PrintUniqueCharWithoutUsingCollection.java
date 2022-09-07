package String_Programs;

// print duplicate char in the string ?

public class PrintUniqueCharWithoutUsingCollection {

	public static void main(String[] args) {

		String s = "karnataka";
		
		for(int i=0; i<s.length(); i++) {
			
			int count = 0;
			
			for(int j=0; j<s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j) && i!=j) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(s.charAt(i)+ " ");
			}
		}
	}

}
