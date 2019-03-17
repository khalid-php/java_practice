//find the largest element of the array in the array
import java.io.*;
class LargestArray {
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the array elemt --"+(i+1)+"index position");
			arr[i]=Integer.parseInt(br.readLine());
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >max) {
				max=arr[i];
			}
		}
		System.out.println("the max no---"+max);
	}
}