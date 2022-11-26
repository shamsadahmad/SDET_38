package String_Programs;

//s s s s s * 
//s s s s * * 
//s s s * * * 
//s s * * * * 
//s * * * * * 
public class IncreaseStarPatternInReverseDirection {
	public static void main(String[] args) {


		int n=5;
		for(int i=1;i<=n;i++)	
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("s ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

