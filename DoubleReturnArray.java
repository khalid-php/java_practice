/* the program is double type array
 in returnig values and no values pass */
import java.util.*;
class DoubleReturnArray {
	double addarray(double[] abc) {
		double sum=0.0;
		for(double x:abc) {
			sum=sum+x;
		}
		return sum;
	}
	public static void main(String args[]) {
		DoubleReturnArray dra=new DoubleReturnArray();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size:-");
		int n=sc.nextInt();
		double arr[]=new double[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the element--"+(i+1)+" ");
			double dt=sc.nextDouble();
			arr[i]=dt;
		}
		double res=dra.addarray(arr);
		System.out.println("sum of array :-"+ res);

	}	
}