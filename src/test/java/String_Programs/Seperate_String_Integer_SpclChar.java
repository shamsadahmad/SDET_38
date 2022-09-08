package String_Programs;

public class Seperate_String_Integer_SpclChar {

	public static void main(String[] args) {

		String s="ab~!df&54as@23#^*)(+_`8";
		String alpha=" ";
		String num=" ";
		String spc=" ";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z') {
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);
				sum=sum+(s.charAt(i)-48);
			}
			else {
				spc=spc+s.charAt(i);
			}						
		}
		
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spc);
		System.out.println(sum);
	}

}
