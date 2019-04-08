//the program is the use of the abstract constractor 
//member and method is use of 
abstract class Bike  {
	Bike () {
		System.out.println("this is bike created");
	}
	abstract void run();
	void changeGayer() {
		System.out.println("the is grear Changed");
	}
}
class Honda extends Bike {
	void run() {
		System.out.println("drive the safty of the");
	}
}
class AbstractDemo5 {
	public static void main(String args[]) {
		Bike h=new Honda();
		h.changeGayer();
		h.run();
	}
}
