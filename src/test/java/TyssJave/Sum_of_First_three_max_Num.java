package TyssJave;

public class Sum_of_First_three_max_Num {

	public static void main(String[] args) {
			
			int a[]= {1,5,55,32,4,62,22};
			
			for(int i=0; i<a.length; i++) {
				
				for(int j=i+1; j<a.length; j++) {
					
					if(a[i]<a[j]) {
						int temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println(a[1]+a[0]+a[2]);
			System.out.println("first min num is "+ a[0]);
			System.out.println("Second min num is "+ a[1]);
			System.out.println("third min number is "+ a[2]);
	}

}
