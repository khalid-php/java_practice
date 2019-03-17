//program is use of the rotate left array program is use
class Rotationleftarray {
	public static void main(String args[]) {
		int arr[]={1,2,5,6,3,11,23,56,78}; //initialization the array
		//n determind the number of time an array should be rotate
		int n=3;
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +"  ");
		}
		for(int i=0;i<n;i++) {
			int j,first;
			first = arr[0];
			for(j=i+1;j<arr.length-1;j++) {
				arr[j] = arr[j+1];

			}
			arr[j]=first;
			System.out.println();
		}
		System.out.println("array left rotaton");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}
}