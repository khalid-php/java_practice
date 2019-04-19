//the program is the use of the access modifer is use
class Abc {
	private int a=40;
	private  void msg() {
		System.out.println("the is the private method");
	}
}
class AccessModifier {
	public static void main(String args[]) {
		Abc ab =new Abc();
		ab.msg();
		System.out.println(ab.a);
	}
}