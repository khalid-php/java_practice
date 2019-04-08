//the real scenario of the java abstract and interfce 
//the interface class begine
interface  A {
	void a();
	void b();
	public void c();
	void d();
	
}
//abstract class and overriden the method and is-a relathin
abstract class B implements A {
	public void c() {
		System.out.println("i am c method");
	}
}
class M extends B {
	public void a() {
		System.out.println("i am a method");
	}
	public void b() {
		System.out.println("i am b method");
	}
	public void d() {
		System.out.println("i am d method");
	}
}
class AbstractDemo6 {
	public static void main(String arg[]){
		A a=new M(); //downcasting
		a.a();
		a.b();
		a.c();
		a.d();
	}
}