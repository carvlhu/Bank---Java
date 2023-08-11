package application;

public class Conta {
	
	int number;
	String name;
	double balance;
	
	boolean withdraw (double quantify) {
		
		if (this.balance < quantify) {
			System.out.println("Saldo insuficiente para saque.");
			return false;
		} else {
			this.balance -= quantify;
			System.out.println("Saldo efetuado com sucesso");
			return true;
		}
		
	}
	
	public void deposit (double quantify) {
		this.balance += quantify;
	}

}
