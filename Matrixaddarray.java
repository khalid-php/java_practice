/*To the add the matrix in the a b c  	k l m
							   d e f  + n o p
							   g h i    q r s */
class Matrixaddarray {
	public static void main(String arg[]) {
		int a[][]={{2,4,5},{3,7,9},{5,8,9}};
		int [][]b={{12,13,14},{15,16,18},{18,19,20}};
		int [][]c=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}							   