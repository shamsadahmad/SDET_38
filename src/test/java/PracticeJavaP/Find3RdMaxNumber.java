package PracticeJavaP;

import org.testng.annotations.Test;

public class Find3RdMaxNumber {
	@Test
	public void thirdMaxNumber() {
		
		int[] no = {10,40,20,70,11,21};
		int temp=0;
		for(int i=0;i<no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i] < no[j]) {
					 temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}				
			}
		}
		System.out.println(no[2]);
		System.out.println(no[3]);
		System.out.println(no[4]);
		System.out.println(no[5]);
//		System.out.println(no[6]);
	}
}
