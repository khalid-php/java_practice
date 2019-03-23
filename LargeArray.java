//To find the large the element of the array
import java.io.*;
class LargeArray {
	public static int getLargest(int[] arr,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[total-1];
	}
	public static void main(String args[])throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter the array size  :");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the array element--"+"index of-"+i+1+" values ");
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("large no "+getLargest(arr,size));
	}
}