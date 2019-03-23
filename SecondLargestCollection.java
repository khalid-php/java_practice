import java.util.*;
class SecondLargestCollection {
	public static int getSecondLargest(Integer[] a,int total) {
		List<Integer>list=Arrays.asList(a);
		Collections.sort(list);
		int element=list.get(1);
		return element;
	}
	public static void main(String args[]) {
		Integer a[]={12,3,5,123,567,905};
		Integer b[]={20,34,56,234,567,890,564,234};
		System.out.println("second Largest no "+getSecondLargest(a,6));
		System.out.println("second largest no "+getSecondLargest(b,8));	
	}
}