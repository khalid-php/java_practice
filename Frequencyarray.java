//to find frequency in the java program 
class Frequencyarray {
	public static void main(String arg[]) {
		//initialisation of array
		int arr[] ={12,23,45,56,90,89,11};
		//create new array in the 
		int fre[] =new int[arr.length];
		int visited = -1;
		//cheaking the loop
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					//avoid the same in element again
					fre[i] = visited;
				}
			}
			if(fre[i] != visited) {
				fre[i] = count;
			}
			System.out.println("--------------------");
			System.out.println("element | Frequencyarray");
			System.out.println("--------------------------");
		}
		for(int i=0;i<fre.length;i++) {
			if(fre[i] != visited) {
				System.out.println("   "+arr[i]+" | "+fre[i]);
			}
		}
		System.out.println("--------------------------");	
	}
}