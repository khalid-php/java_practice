
//the program is use of the multiplication for the array matrix
class Matrixmultipliaction {
	public static void main(String args[]) {
		//decleration and initialisation array
		int [][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int b[][]={{15,16,17,18},{19,20,21,22},{24,25,26,27}};
		int c[][] = new [3][4];
		//multiply the matrix 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i][j] = 0;
				for(int k=0;k<c.length;j++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.println(c[i][j] +" ");
			}
			System.out.println();
		}
	}
}