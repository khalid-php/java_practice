//the program is the acces the variable and the method 
class Access1 {
	void m4() {
		Access c=new Access();
		System.out.println(c.x);
		c.m1();
		System.out.println(Access.y);
		c.m3();
		System.out.println("instance method m4");
	}
	public static void main(String args[]) {
		Access d=new Access();
		System.out.println(Access.y);
		d.m3();
		System.out.println(d.x);
		d.m1();
		Access1 b=new Access1();
		b.m4();
	}
} 	