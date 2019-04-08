//the program is the use of the other program is use
abstract class Bank {
	abstract int getInterestRate();
}
class Pnb extends Bank {
	int getInterestRate() {
		return 9;
	}
}
class Boi extends Bank {
	int getInterestRate() {
		return 11;
	}
}
class Icic extends Bank {
	int getInterestRate() {
		return 10;
	}
}
class Union extends Bank {
	int getInterestRate() {
		return 13;
	}
}
class AbstractDemo4 {
	public static void main(String args[]) {
		Bank bn;
		bn=new Pnb();
		System.out.println("getInterestRate"+bn.getInterestRate());
		bn=new Boi();
		System.out.println("getInterestRate"+bn.getInterestRate());
		bn=new Icic();
		System.out.println("getInterestRate"+bn.getInterestRate());
		bn=new Union();
		System.out.println("getInterestRate"+bn.getInterestRate());
	}
}