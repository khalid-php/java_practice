class SecondLargestInArray {
	public static int getSecondLargest(int[]a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}
	public static void main(String args[]) {
		int[]a={1,2,4,5,6,8};
		int[]b={11,22,33,44,66,77,88};
		System.out.println("second Largest element"+getSecondLargest(a,4));
		System.out.println("second Largest element"+getSecondLargest(b,5));
	}
}