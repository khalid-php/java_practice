/* the program is use to constructor 
*/
class ConstructorExample {
	int rollno;
	ConstructorExample() {
		rollno=1089;
	}
	void dispaly() {
		System.out.println(rollno);
	}
	public static void main(String args[]) {
		ConstructorExample ce=new ConstructorExample();
		ce.dispaly();
	}
}