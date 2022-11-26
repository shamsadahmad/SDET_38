package String_Programs;

import java.util.Scanner;

//$  $  $  $  $ 
//$  $  $  $  $ 
//$  $  $  $  $ 
//$  $  $  $  $ 
//$  $  $  $  $ 
public class FiveStarPatterns {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=obj.nextInt();

//		int n=5;
			for(int i=1;i<=n;i++)	
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print(" $ ");
				}
				System.out.println();
			}
		}
	}


