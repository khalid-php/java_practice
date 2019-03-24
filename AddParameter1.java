/* example of the with parameter and not return 
type is additoin and using the buffered Reader stream */
import java.io.*;
class AddParameter1 {
	void add(float a,float b) {
		float d=a+b;
		System.out.println(d);
	}
	public static void main(String args[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the float first number :-");
		float m=Float.parseFloat(br.readLine());
		System.out.println("Enter the float second number:- ");
		float n=Float.parseFloat(br.readLine());
		AddParameter1 adp=new AddParameter1();
		adp.add(m,n);
	}
}