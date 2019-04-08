/*/program is to the intialization the value from one object to another object*/
class CopyConstruct {
	int id;
	String name;
	CopyConstruct(int x,String n) {
		id=x;
		name=n;
	}
	CopyConstruct(CopyConstruct st) {
		id=st.id;
		name=st.name;
	}
	void disply() {
		System.out.println(id+" "+name);
	}
	public static void main(String args[]) {
		CopyConstruct cc=new CopyConstruct(100,"Abid Hussain");
		CopyConstruct cc1=new CopyConstruct(cc);
		cc.disply();
		cc1.disply();
	}
}