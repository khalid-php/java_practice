//to find the odd position of the array
import java.io.*;
class Oddposarray {
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array--");
		int n=Integer.parseInt(br.readLine());
		int arr[] =new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the array"+(i+1)+"Element--");
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println("odd position of array element --"+arr[i]);
		}
	}
}	
		