/* the method returing the an object 
user defined datatype in the array of the user defined datatype */
class Customer12 {
	int cusId=1236;
	String name="hussain";
}
class MethoReturn {
	public static void main(String args[]) { 
	MethoReturn mr=new MethoReturn();
	Customer12 cs=mr.getObject();
	System.out.println(cs.cusId);
	System.out.println(cs.name);
	}
	Customer12 getObject() {
		Customer12 cs1=new Customer12();
		return cs1;
	}
}