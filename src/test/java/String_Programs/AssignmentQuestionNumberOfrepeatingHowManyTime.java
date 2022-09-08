package String_Programs;

import java.util.LinkedHashSet;

public class AssignmentQuestionNumberOfrepeatingHowManyTime {

	public static void main(String[] args) {

		int[] a = {3,21,3,5,4,6,6,};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			for(int i=0; i<a.length; i++) {
				set.add(a[i]);
			}
		for(Integer inte:set) {
			int count =0;
			for(int i=0;i<a.length;i++) {
				if(inte==a[i]) {
					count++;
			 	}
			}
			System.out.println(inte+"-is repeating "+count+" - Time");
		}
	}
}
