/* the method is the returning an object int he user defined data type
*/
class Employee123 {
	int eid=104;
	String ename="khalid hussain";
	double esal=11234.989;
	String eadd="patna bihar";
}
class EmployeeUserDefinde {
	public static void main(String args[]) {
		EmployeeUserDefinde eud=new EmployeeUserDefinde();
		Employee123 ep=eud.getObject();
		System.out.println(ep.eid);
		System.out.println(ep.ename);
		System.out.println(ep.esal);
		System.out.println(ep.eadd);
	}
	Employee123 getObject() {
		Employee123 emp=new Employee123();
		return emp;
	}
}