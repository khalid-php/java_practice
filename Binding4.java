//the program is the use of the dynamic binding
class Hospital {
	void opration() {
		System.out.println("multisplist hospital--");
	} 
}
class Eye extends Hospital {
	void opration() {
		System.out.println("eye operation deptment");
	}
}
class Binding4 {
	public static void main(String args[]) {
		Hospital h=new Eye();
		h.opration();
	}
}