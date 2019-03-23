/* the progrma is multiple object is use*/
class Rectangle {
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
	}
	void calculatearea() {
		System.out.println(length*width);
	}
}
class RectangleTestObject {
	public static void main(String args[]) {
		Rectangle r1=new Rectangle(),
				  r2=new Rectangle();
				  r1.insert(12,8);
				  r2.insert(5,8);
				  r1.calculatearea();
				  r2.calculatearea(); 
	}
}