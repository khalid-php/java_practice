//the programa is copy one array to another array
class Copyarray {
	public static void main(String args[]) {
		int a[] ={12,23,45,56,67,89};
		int b[] = new int [a.length];
		for(int i=0;i<a.length;i++){
			b[i] = a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i] +" ");
		}
	}
}