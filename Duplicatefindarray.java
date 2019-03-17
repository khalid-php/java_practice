//find the duplicate value in array 
class Duplicatefindarray {
	static public void main(String args[]) {
		int arr[] = {12,34,56,67,23,12,56,67};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] ==arr[j]) {
					System.out.print(arr[j]+ " ");
				}
			}
		}
	}
}