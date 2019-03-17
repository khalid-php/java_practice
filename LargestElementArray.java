//to find the largest element in the array
import java.io.*;
class LargestElementArray {
	void largestarra(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array");
		int size=Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the array element --"+i+1+"index position--");
			arr[i]=Integer.parseInt(br.readLine());
		}
		int max=arr[0];
		for(int=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
			System.out.println(max);
		}
	}
	public static void main(String args[])throws Exception {
		
		LargestElementArray ad=new LargestElementArray();
		ad.largestarra();
	}
}