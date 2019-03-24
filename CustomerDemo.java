/* the method taking object (user defined data type) as parameter 
*/ 
class Customer11 {
	int cusId=123;
	String cusname="khalid";
	double cusl=1890.900;
}
class CustomerDemo {
	public static void main(String args[]) {
		Customer11 cus=new Customer11();
		CustomerDemo cd=new CustomerDemo();
		cd.display(cus);
	}
	void display(Customer11 cs) {
		System.out.println(cs.cusId);
		System.out.println(cs.cusname);
		System.out.println(cs.cusl);
	}
}