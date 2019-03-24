/* the is the method of the char[] array the in the array parameter */
import java.util.*;
class ArrayCharDemo {
	void display(char[] temp) {
		for(char x:temp) {
			System.out.print(x+"\t");
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size :");
		int n=sc.nextInt();
		char []a=new char[n];

		
		for(int i=0;i<n;i++) {
			System.out.println("enter the char arry element:-"+(i)+" ");
			char c=sc.next().charAt(0);
			a[i]=c;
		}
		ArrayCharDemo ar= new ArrayCharDemo();
		ar.display(a);

	}
}