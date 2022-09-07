package TyssJave;

//0 1 1 2 3 5 8 13 21 34
public class First_Ten_Fibonachi_Number {

	public static void main(String[] args) {

		int n=10, firstTerm=0, secondTerm=1;

		System.out.print(firstTerm+" "+secondTerm+" ");
		for(int i=3;i<=n;i++){  //1  //2  //3  //4  //5  //6  //7  //8  //9//  //10  //11
			int nextTerm = firstTerm+secondTerm;  //1  //2  //3  //5  //8 //13  //21  //34
			firstTerm=secondTerm;	//1  //1   //2  //3  //5  //8  //13  //21
			secondTerm = nextTerm;  //1  //2   //3  //5  //8  //13  //21  //34
			System.out.print(nextTerm+" ");   //1   //2  //3  //5  //8  //13  //21  //34
		}

	}

}


