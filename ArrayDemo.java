/* The program is method taking array as parameter */
class ArrayDemo {
	void display(double[] temp) {
		for(double x:temp) {
			System.out.println(x);
		}
	}
	public static void main(String []args) {
		ArrayDemo ad=new ArrayDemo();
		double arr[]={1.3,5.6,7.9,45.90};
		ad.display(arr);
		double nos[]={23.45,89.90,1.34,5.900};
		ad.display(nos);
	}
}