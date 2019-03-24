/*the progrma is the use of the method returning in the array
the use of scanner is use 
*/
import java.util.*;
class ArrayInteger {
	int [] getAttay() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the array element-"+i+" ");
			int a=sc.nextInt();
			arr[i]=a;
		}
		return arr;
	}
	public static void main(String args[]) {
		ArrayInteger ai=new ArrayInteger();
		int abc[]=ai.getAttay();
		for(int z:abc) {
			System.out.println(z);
		}
	}
}
