//to find the rotation the right side of the element
class RightRotateArray {
	public static void main(String args[]) {
		int arr1[]={12,23,12,56,45,89,90};
		int n=3;
		System.out.println("Originally array --");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		for(int i=0;i<n;i++) {
			int j,last;
			last=arr1[arr1.length-1];
			for(j=arr1.length-1;j>0;j--) {
				arr1[j]=arr1[j-1];
			}
			arr1[0]=last;
		System.out.println();
		}
		System.out.println("After the array--");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+" ");
		}
	}
}