class AnanomiasFactorial {
	void factorial(int n) {
		int fact=1;
		for(int i=0;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial is :-"+fact); 

	}
	public static void main(String args[]) {
		new AnanomiasFactorial().fact(9);
	}
}