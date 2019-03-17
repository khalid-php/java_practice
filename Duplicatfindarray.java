//to find the duplicate element in the array 
import java.io.*;
class Duplicatfindarray {
	static public void main(String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the size of array");
		int size=Integer.parseInt(br.readLine());
		int[] arr = new int[size];

		for(int i=0;i<size;i++) {
			System.out.println("enter element elemnet "+(i+1));
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +"\t");
		}
	}
}