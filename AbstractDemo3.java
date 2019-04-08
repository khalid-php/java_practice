//the program isthe use of the abstract method and 
//abstract class 
abstract class Shape1 {
	void display() {
		System.out.println("the draing the shap ");
	}
	abstract void draw();
}
class Trangle1 extends Shape1 {
	void draw() {
		System.out.println("the Trangle1 is draw");
	}
}
class Rectangle extends Shape1 {
	void draw(){
		System.out.println("the Rectangle is draw ");
	}
}
class Clone extends Shape1 {
	void draw() {
		System.out.println("the Clone is draw ");
	}
}
class AbstractDemo3 {
	public static void main(String args[]) {
		Shape1 s1;
		s1=new Trangle1();
		s1.draw();
		s1=new Rectangle();
		s1.draw();
		s1=new Clone();
		s1.draw();
	}
} 