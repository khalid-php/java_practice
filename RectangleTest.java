/* To the example of the object and class intialisation
and the rectagle area example */
class Rectangle {
	int length;
	int width;
	float ar;
	void insertrecord(int l,int w) {
		length=l;
		width=w;
	}
	void calarea() {
		ar=length*width;
		//System.out.println(ar);
	}
	void msg() {
		System.out.println("length of :"+length);
		System.out.println("the width of :"+width);
		System.out.println("total area of rectangle: "+ar);
	}
}
class RectangleTest {
	public static void main(String arge[]) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();
		r1.insertrecord(12,15);
		r2.insertrecord(10,15);
		r3.insertrecord(30,45);
		r1.calarea();
		r2.calarea();
		r3.calarea();
		r1.msg();
		r2.msg();
		r3.msg();
	}
}