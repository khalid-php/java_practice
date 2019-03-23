import java.util.Arrays;
class LargestArrayofArray {
	public static int getLargeArray(int a[],int total) {
		Arrays.sort(a);
		return a[total-1];
	}
	public static void main(String args[]) {
		int a[]={12,34,56,78,89,90,109};
		int b[]={102,203,300,400,500,600,7,0,1000,00};
		System.out.println("Largset array--"+getLargeArray(a,7));
		System.out.println("largest array--"+getLargeArray(b,10));
	}
}