//To the find the odd and even in array 
import java.io.*;
class OddEvenArray {
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		System.out.print("Enter any size of elemet--");
		for(int i=0;i<n;i++) {
			System.out.print("Enter elemet of array--"+(i+1)+"index---");
			a[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 !=0){
				System.out.print(a[i]);
			}
		}
		System.out.println("even number");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" ");
			}	
		}
	}
}