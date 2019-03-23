//To find the duplicate the element in the array 
class DuplicateArray {
	public static int removeArrayElemet(int arr[],int n) {
		if(n==0 ||n==1) {
			return n;
		}
		int []temp =new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] !=arr[i+1]){
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	public static void main(String args[]) {
		int arr[]={10,10,20,30,40,30,30,40,40,40,40,60,60,60};
		int length=arr.length;
		length=removeArrayElemet(arr,length);
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}