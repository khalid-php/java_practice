/*to the example of object and class initiallisation throug constructor */
class Employee {
	int id;
	String name;
	float sal;
	String dept;
	void insert(int i,String n,float s,String d) {
		id=i;
		name=n;
		sal=s;
		dept=d;
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(dept);
	}
}
class EmployeeObject {
	public static void main(String args[]) {
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	Employee e4=new Employee();
	e1.insert(100,"Azam",15000,"railway");
	e2.insert(101,"Rehan",17000,"Programmer");
	e3.insert(102,"Faizan",12000,"Parchase");
	e4.insert(104,"Farhan",35000,"bank");
	e1.show();
	e2.show();
	e3.show();
	e4.show();
	}
}