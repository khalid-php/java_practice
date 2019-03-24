/*the method with return and without parameters
use in addition in the long datatype */
import java.util.*;
class AdLongreturn {
	long add(long a,long b) {
		long c=a+b;
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  long no:-");
		long m=sc.nextLong();
		System.out.println("second long no:-");
		long z=sc.nextLong();
		AdLongreturn alr=new AdLongreturn();
		long res=alr.add(m,z);
		System.out.println("Addition of two number:-"+res); 	
	}
	
}