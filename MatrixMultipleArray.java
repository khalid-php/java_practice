/* the program
   a b c    q r t         a b c   q r t
A= d e f  B m j l  = A*B  d e f * m j l  
   h i g    g h r         h i g   g h r
    */
import java.io.*;
class MatrixMultipleArray {
	public static void main(String args[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the");
		int n=Integer.parseInt(br.readLine());
		int a[][]=new int [n][n];
		//input the first array element of the list
		for(int i=0;i<n;i++){
			for (int j=0;j<n;j++) {
			System.out.println("Enter the First array Element"+i+1+"index:-");	
			a[i][j]=Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
		//input the second array element
		int b[][]=new int[n][n];
		System.out.println("size of second array element "+n);
		for(int i=0;i<n;i++ ) {
			for(int j=0;j<n;j++) {
				System.out.print("Enter the second element "+1+1+" index--");
				b[i][j]=Integer.parseInt(br.readLine());	
			}
			System.out.println();
		}
		int c[][]=new int[n][n];
		
		for (int i=0;i<n;i++) { //loop out start i 
			for (int j=0;j<n;j++) { //loop the start j
				c[i][j]=0;
				for (int k=0;k<n;k++) { //loop inner the k start
					c[i][j]+=a[i][k]*b[k][j];		
				} //end k loop
				System.out.print(c[i][j]+" ");	
			} // end j loop 
			System.out.println();
		} //loop i end

	}
}