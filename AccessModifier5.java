//the use of the the access modifier is the use
class Abc1 {
	protected void msg() {
		System.out.println("the is the hyderabad");
	}
}
public class AccessModifier5 extends Abc1 {
	 //the method is not overriden because the protected
	// void msg() { 
	// 	System.out.println("this tis mumbai");
	// }
	public static void main(String args[]) {
		AccessModifier5 am1=new AccessModifier5();
		am1.msg();
	}
}