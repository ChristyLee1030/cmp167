/**
 * @author Christy Lee
 */
public class BankAccount {
	private int number;
	private double balance;
	private static int numberOfAccounts;

	public BankAccount() {
		number = ++numberOfAccounts;
	}

	public void deposit(double amount ) {
		if (amount >= 0.0) {
			balance += amount ;
			displayTransaction(true, amount, 'd');
		}
		else {
			displayTransaction(false, amount, 'd');
		}
	}
	public void withdraw(double amount) {
		if ((balance-amount)>=0) {
			balance -= amount;
			displayTransaction(true, amount, 'w');
		}
		else {
			displayTransaction(false, amount, 'w');
		}
	}

	public void displayTransaction(boolean state, double amount, char mode) {
		if (mode =='d') {
			if (state ) {
				System.out.println("Transaction successful, $"+ amount +" has been added to account # "+number+".\nNew balance: $"+balance);
			}
			else {
				System.out.println("Transaction unsuccessful, invalid amount");
			}
		}
		else if (mode=='w'){
			if (state ) {
				System.out.println("Transaction successful, $"+ amount +" has been withdrawn from account #"+number+".\nNew balance: $"+balance);
			}else {
				System.out.println("Transaction unsuccessful, insuficient balance");
			}
		}
	}
	@Override
	public String toString() {
		return " number #"+number + ", balance $"+balance;
	}
}
