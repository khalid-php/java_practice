/*we are creating the two objects of Student
 class and initializing the value to these objects 
 by invoking the insertRecord method.*/
 class Customer {
 	int cid;
 	String cname;
 	double csal;
 	String cdesign;
 	String cdept;
 	int cdeptno;
 	void cusrecord(int d,String n,double s,String de,String dt,int dpt) {
 		cid=d;
 		cname=n;
 		csal=s;
 		cdesign=de;
 		cdept=dt;
 		cdeptno=dpt;
 	}
 	void cusinform() {
 		System.out.println(cid);
 		System.out.println(cname);
 		System.out.println(csal);
 		System.out.println(cdesign);
 		System.out.println(cdept);
 		System.out.println(cdeptno);
 	}
}
class CustomerObject {
	public static void main(String args[]) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		c1.cusrecord(1001,"Ramesh",1000,"Assistent","Electric",10);
		c1.cusrecord(1002,"Denesh",1200,"Clerk","Electric",20);
		c1.cusrecord(1003,"wahid",1500,"salsmane","Electric",30);
		c1.cusinform();
		c2.cusrecord(2001,"ALI",1100,"Assistent","Education",50);
		c2.cusrecord(2002,"Hussain",1400,"Manager","Education",60);
		c2.cusinform();

	}
}