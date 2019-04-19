class Abc1 {
	private Abc1() {
		System.out.println("the constructer");
	}
	private void msg() {
		System.out.println("the msg is method");
	}
}
class AccessModifier1 {
	public static void main(String args[]) {
		Abc1 ab1=new Abc1();
		ab1.msg();
	}
}