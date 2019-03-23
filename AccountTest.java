/* java program is to represent the bank-system 
Java Program to demonstrate the working of a banking-system  
where we deposit and withdraw amount from our account.  
Creating an Account class which has deposit() and withdraw() methods */  
class Account {
	int acc_no;
	String name;
	float Amount;
	//method initialistion
	void insert(int a,String n,float amt) {
		acc_no=a;
		name=n;
		Amount=amt;
	}
	//to deposit process
	void deposit(float amt) {
		Amount=Amount+amt;
		System.out.println(amt +" :deposited");
	}
	//the process of the withdraw
	void withdraw(float amt) {
		if(Amount<amt) {
			System.out.println("insufficent balance");
		} else {
			Amount=Amount-amt;
			System.out.println(amt+ " withdraw");
		}
	}
	void checkbalance() {
		System.out.println("balance :" + Amount);
	}
	void disply() {
		System.out.println("account no : "+acc_no);
		System.out.println("name of customer: "+name);
		System.out.println("Amount of total: "+Amount);
	}
}
//creating test class a desposit and withdraw process
class AccountTest {
	public static void main(String args[]) {
		Account a1=new Account();
		a1.insert(78349012,"khalid",5000);
		a1.disply();
		a1.checkbalance();
		a1.deposit(40000);
		a1.checkbalance();
		a1.withdraw(15000);
		a1.checkbalance();
	}
}