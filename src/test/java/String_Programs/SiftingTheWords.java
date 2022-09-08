package String_Programs;

public class SiftingTheWords {

	public static void main(String[] args) {

		String word  = "Ashmita Sajid Shamsad Shankar they all are Strainger People";
		String str[] = word.split(" ");
		//0 =asmita, 1=sajid , 2=sam ,3=lucha , 4= they, 5=all,6=are, 7=strainger, 8=people ; 
		String temp = str[3];  // store asmita into temp ;
		
		str[3] = str[str.length-1]; 
		str[str.length-1] = temp;
		
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]);
		}
	}

}
