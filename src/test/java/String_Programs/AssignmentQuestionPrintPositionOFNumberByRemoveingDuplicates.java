package String_Programs;

import java.util.LinkedHashSet;

public class AssignmentQuestionPrintPositionOFNumberByRemoveingDuplicates {

	public static void main(String[] args) {

		int[] a = {3,3,21,33,5,4,6,6,66,66,};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
			for(int i=0; i<a.length; i++) {
				set.add(a[i]);
			}
		for(Integer inte:set) {
			
			for(int i=0;i<a.length;i++) {
				
				if(inte==a[i]) {
					System.out.println(inte+"-is present in "+(i+1)+ " - position");
					break;
				}
			}
		}
	}

}
