/* the program is use of the object the method in 
*/
class Student{
	int rollno=123;
	String name="Farhan";
	double markes=189.89;
}
class ObjectArray {
	void display(Student stu) {
		System.out.println(stu.rollno);
		System.out.println(stu.name);
		System.out.println(stu.markes);
	}
	public static void main(String args[]) {
		Student st=new Student();
		OjectArray oa=new OjectArray();
		oa.display(st);
	}
} 