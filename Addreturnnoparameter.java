 /* the program is demostrate the method with return type and 
 without parameter */
 class Addreturnnoparameter {
 	double add() {
 		double a=45.67;
 		double b=560.0980;
 		double c=a+b;
 		return c;
 	}
 	public static void main(String args[]) {
 		Addreturnnoparameter ap=new Addreturnnoparameter();
 		double res=ap.add();
 		System.out.println(res);
 	}
}