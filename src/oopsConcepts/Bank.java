package oopsConcepts;

import java.util.ArrayList;

class CurrentAccount extends Bank{
	int creditLimit = 2000;
	public CurrentAccount(String name) {
		super(name);
	}
	@Override
	public int withdraw(int amount) {
		if(getCash()>amount) {
			totalDeposits-=amount;
			return-(amount);
		}
		else {
			return 0;
		}
	}
	public int getCash() {
		return(totalDeposits);
	}
}
class SavingsAccount extends Bank {
	int fixedDepositAccount = 5000;
	public SavingsAccount(String name) {
		super(name);
	}

@Override
public int getCash() {
	return (fixedDepositAccount+=totalDeposits);
}
public int withdraw(int amount) {
	if(getCash()>amount) {
		totalDeposits-=amount;
		return -(amount);
	}
	else {
		return 0;
	}
}
}
public class Bank{
	static ArrayList<Integer> totalCashInBank;
	private String name;
	protected int totalDeposits=0;
	public Bank(String name) {
	this.setName(name);
}
public int deposit(int amount) {
	this.totalDeposits += amount;
	return amount;
}
public int withdraw(int amount) {
	if (totalDeposits>amount) {
		totalDeposits-=amount;
		return amount;
	}
	else {
		return 0;
	}
}
public static int totalCashInBank(ArrayList<Integer> cash) {
	int total = 0;
	for (int i = 0; i<cash.size(); i++) {
		total+=cash.get(i);
	}
	return total;
}
public int getCash() {
	return totalDeposits;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public class Main {

	public static void main(String[] args) {
		totalCashInBank = new ArrayList<Integer>();
		Bank account1 = new SavingsAccount("account1");
		Bank account2 = new CurrentAccount("account2");
		SavingsAccount account3 = new SavingsAccount("account3");
		CurrentAccount account4 = new CurrentAccount("account4");
		totalCashInBank.add(account1.deposit(1000));
		totalCashInBank.add(account2.deposit(2000));
		totalCashInBank.add(account3.deposit(3000));
		totalCashInBank.add(account4.deposit(4000));
		System.out.println(totalCashInBank((totalCashInBank)));

	}

}
}