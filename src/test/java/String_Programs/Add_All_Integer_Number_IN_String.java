package String_Programs;

public class Add_All_Integer_Number_IN_String {

	public static void main(String[] args) {

		String s="ab~!df&54as@23#^*)(+_`8";
		int tsum=0;
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n= s.charAt(i);
				sum=sum+(s.charAt(i)-48);
				tsum=tsum*10+n;
			} else {
				sum=sum+tsum;
				tsum=0;
			} 
		}	
		sum=sum+tsum;
		System.out.println(sum);
	}

}
