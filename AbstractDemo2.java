//the program is the use of the absract class and method
abstract class Bike {
	abstract void run();
}
class Honda4 extends Bike {
	void run() {
		System.out.println("the running safe-");
	}
}
class AbstractDemo2 {
	public static void main(String args[]) {
		Bike b;
		b=new Honda4();
		b.run();
	}
}
