//To the find of the duplicateUnsortedArray in the example
import java.util.*;
class DuplicateUnsortedArray {
	public static int getduplicteUnsortedArray(int arr[],int n) {
		if(n==0 ||n==1) {
			return n;
		}
		int temp[]=new int [n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for (int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	public static void main(String args[]) {
		int arr[]={12,24,12,24,45,45,45,60,60,60,90,90,90,90};
		Arrays.sort(arr);
		int length=arr.length;
		length=getduplicteUnsortedArray(arr,length);
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}