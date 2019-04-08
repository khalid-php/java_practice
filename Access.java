/* the program is the use of the access the all the access in the static and 
*/
class Access {
	int x=11;
	static int y=22;
	void m1() {
		System.out.println("instance method m1");
	}
	void m2() {
		System.out.println(x);
		m1();
		System.out.println(y);
		m3();
		System.out.println("instance method m2");
	}
	static void m3() {
		System.out.println("instance method m3");
	}
	public static void main(String args[]) {
		System.out.println(y);
		m3();
		Access a=new Access();
		System.out.println(a.x);
		a.m2();
	}
}