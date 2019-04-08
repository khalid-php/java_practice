//the program isthe use of the abstract class 
//the check weather the use ofthe constactor aind find the shap area
abstract class Shape {
	int dim1,dim2;
	Shape(int dim1,int dim2) {
		this.dim1=dim1;
		this.dim2=dim2;
	}
	abstract double area();
}
class Rectangle extends Shape {
	Rectangle(int len,int breath) {
		super(len,breath);
	}
	double area() {
		return dim1*dim2;
	}
}
class Trangle extends Shape {
	Trangle(int height,int base) {
		super(height,base);
	}
	double area() {
		return dim1*dim2*.5;
	}
}
class AbstractDemo1 {
	public static void main(String arg[]){
	Shape s;
	s=new Rectangle(8,18);
	double re = s.area();
	System.out.println("result Retrangle:-"+re);
	s=new Trangle(23,45);
	double re1 = s.area();
	System.out.println("the Trangle:-"+re1);	
	}
	
}