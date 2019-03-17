//to find the even position in the array
import java.io.*;
class Evenposarray {
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array--");
		int size =Integer.parseInt(br.readLine());
		int arr[] =new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("enter the element--"+(i+1));
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+"\teven position");
		}
	}
}