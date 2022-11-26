package String_Programs;

public class Add_All_Integer_Number_IN_String {

	public static void main(String[] args) {

//		String s="ab~!df&54as@23#^*)(+_`8";
		String s="ab54hg6fr6t5r4e3";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				sum=sum+(s.charAt(i)-48);
			} 
		}	
		System.out.println(sum);
	}

}
