//program is use of character in the method with array as a parameter
class Methodwithchararray {
	public static void main(String args[]) {
		char arr[] ={'q','w','e','r','t','g'};
		Methodwithchararray ad=new Methodwithchararray();
		ad.display(arr);
	}
	void display(char[] temp) {
		for(char x :temp) {
			System.out.println(x +" ");
		}
	}
}