//the program is use of the constructor overloading 
class Rectangle {
	int length,breath;
	Rectangle() {
		length=breath=3;
	}
	Rectangle(int x) {
		length=breath=x;
	}
	Rectangle(int length,int breath) {
		this.length=length;
		this.breath=breath;
	}
	void area() {
		System.out.println("area: "+(length*breath));
	}
	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		r1.area();
		Rectangle r2=new Rectangle(5);
		r2.area();
		Rectangle r3=new Rectangle(20,30);
		r3.area();
	}
}