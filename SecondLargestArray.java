//To find the 2nd the largest array element;
class SecondLargestArray {
	public static void main(String args[]) {
		int arr[]={12,33,56,78,123,678,90};
		int largest=arr[0];
		int second=arr[0];
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>largest) {
				second=largest;
				largest=arr[i];
			}else if(arr[i]>second &&arr[i]<largest) {
				second=arr[i];
			}

		}
		System.out.println("second Largest array-"+second);
	}
} 