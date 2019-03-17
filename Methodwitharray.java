//program is use of the method with array as a parameter
class Methodwitharray{
	public static void main(String args[]) {
		Methodwitharray ad = new Methodwitharray();
		int arr[] = {12,34,56,78,78};
		ad.display(arr);
		int nos[] ={23,45,56,67,78};
		ad.display(nos);
	}
	void display(int[] temp) {
		for(int x:temp) {
			System.out.print(x + " ");
		}
	}
}