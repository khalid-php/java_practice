//find the reverse array element 
import java.io.*;
// class Reversearray {
// 	static public void main(String args[])throws Exception{
// 		BufferedReader br=new BufferedReader(new InputStremReader(System.in));
// 		System.out.println("Enter the array size");
// 		int no=Integer.parseInt(br.readLine());
// 		System.out.println("Enter the value");
// 		int arr[]=new int [no];
// 		for(int i=0;i<arr.length;i++) {
// 			arr[i]=Integer.parseInt(br.readLine());
// 		}
// 		System.out.println("Reversearray--");
// 		for(int i=arr.length-1;i>=0;i--) {
// 			System.out.println(arr[i] + " ");
// 		}
// 	}
// }

//

class Reversearray {
	public static void main(String args[]) {
		//initialization the array
		int arr[]={12,34,56,67,78,90};
		System.out.println("origrianl array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i=arr.length-1;i >=0;i--) {
			System.out.println("Reverse array "+arr[i]);
		}
	}
}