/* to the use of the method return type and
parameter and use in the divided in the use of the scanner and
input the keyboard */
import java.util.*;
class DivideReturn {
	int divide(int a,int b) {
		int c=b/a;
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no:-");
		int f=sc.nextInt();
		System.out.println("Enter the second no:-");
		int h=sc.nextInt();
		DivideReturn dr=new DivideReturn();
		int div=dr.divide(f,h);
		System.out.println("divide the no:-"+div);
	}
}