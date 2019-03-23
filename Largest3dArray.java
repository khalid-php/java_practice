//To find the 3rd largest element of the array
class Largest3dArray {
	public static void main(String arrgs[]) {
		int arr[]={12,34,27,35,89,90,123,345,789};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				int swap=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=swap;
			}
		}
		System.out.println("3rd largest array--" +arr[2]);
	}
}