/* the program is the use of the constructor overloading the */
class ConstructorOverloding {
	int id;
	String name;
	int age;
	ConstructorOverloding(int i,String n) { //create constructor
		id=i;
		name=n;
	}
	ConstructorOverloding(int i,String n,int a) {
		id=i;
		name=n;
		age=a;
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String args[]) {
		ConstructorOverloding cl=new ConstructorOverloding(100,"Hussain");
		ConstructorOverloding cl1=new ConstructorOverloding(103,"jamal",32);
		cl.show();
		cl1.show();

	}

}