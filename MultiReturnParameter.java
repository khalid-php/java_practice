/* The progrma is use method with parameter and return type is display */
import java.util.*;
class MultiReturnParameter {
	double multi(double k,double m) {
		double r=k*m;
		return r;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first double-:");
		double d=sc.nextDouble();
		System.out.println("Enter the second double:-");
		double e=sc.nextDouble();
		MultiReturnParameter mrp=new MultiReturnParameter();
		double mul=mrp.multi(d,e);
		System.out.println("multiple the duble :-"+mul);
	}
}