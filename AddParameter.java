/* the program is using the method without  return type and with 
parameter is pass */
class AddParameter {
	void add(double a,double b) {
		double c=a+b;
		System.out.println(c);
	}
	public static void main(String args[]) {
		AddParameter ad=new AddParameter();
		double x=12.56;
		double y=103.234;
		ad.add(x,y);
	}
