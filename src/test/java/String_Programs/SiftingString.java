package String_Programs;

public class SiftingString {

	public static void main(String[] args) {

		String str="this is the test yantra";
		System.out.println(str);
		String s[] = str.split(" ");
		// s[0] =this, s[1] = is, s[2] = the, s[3] = test , s[4]= yantra 

		//Shifting zero into Last Position vice-versa
		String temp = s[0];  // temp = this
		s[0] = s[s.length-1];  // s[0]  = yantra
		s[s.length-1]=temp;  // s[3] = temp

		// Shifting First into second vice-versa
		String temp2 = s[1];	//temp2 = is
		s[1]=s[2];				//s[1] =the
		s[2]=temp2;

		for(int i=0; i<s.length; i++) {

			System.out.print(s[i]+" ");
		}
	}
}
