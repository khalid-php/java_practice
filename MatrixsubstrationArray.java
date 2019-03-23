/*To the program is substraction of matrix in the 
a b c    k l m    a-b b-l c-m
d e f -  n o p  = d-n e-o f-p
d g h    r s t    d-r g-s h-t */
import java.io.*;
class MatrixsubstrationArray {
	public static void main(String args[])throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter the array size in first array-");
		int n=Integer.parseInt(br.readLine());
		int a[][]=new int[n][n];
		int c[][]=new int[n][n];
		//input first matrix element
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Enter the First Array Element "+(i+1)+"--index :-");
				a[i][j]=Integer.parseInt(br.readLine());
			}
			System.out.println(" ");
		}
		//input second matrix element
		System.out.print("enter the second array size --");
		//int s=Integer.parseInt(br.readLine());
		int b[][]=new int[n][n];
		for (int i=0;i<n;i++) {
			System.out.print("Enter any second array element "+ (i+1)+"--position--");
			for(int j=0;j<n;j++) {
				b[i][j]=Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
		//find the matrix substration of the program
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}

	}
}