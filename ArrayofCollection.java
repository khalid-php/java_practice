//To find the array in the collection of the array
import java.util.*;
class Arrayofcollection {
	public static int getarraycollection(Integer[]a,int total) {
		List<Integer>list=Arrays.asList(a);
		Collections.sort(list);
		int element =list.get(total-1);
		return element;
	}
	public static void main(String args[]) {
		Integer a[]={12,45,609,23,567,906,100,989};
		Integer b[]={1,3,5,6,7,8,9,10,12,34,56,78,12,789,123,234,567,00};
		System.out.println("largest array "+getarraycollection(a,8));
		System.out.println("largest array"+getarraycollection(b,17));
	}
}