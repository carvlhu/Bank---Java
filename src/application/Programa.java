package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta minhaConta = new Conta();
		Conta meuSonho = new Conta();
		
		minhaConta.name = "Rafael Carvalho";
		minhaConta.number = 696969;
		minhaConta.balance = 200.00;
		
		meuSonho.name = "Carvalho";
		meuSonho.number = 707070;
		meuSonho.balance = 500.00;
		
		System.out.println("Titular da Conta: " + minhaConta.name);
		System.out.println("Número da Conta: " + minhaConta.number);
		System.out.println("Saldo da Conta: " + minhaConta.balance);
		minhaConta.deposit(50.00);
		System.out.println("Saldo após o deposito: " + minhaConta.balance);
		minhaConta.withdraw(250.00);
		System.out.println("Saldo após o saque: " + minhaConta.balance);
		
		System.out.println("\n \n Titular da Conta: " + meuSonho.name);
		System.out.println("Número da Conta: " + meuSonho.number);
		System.out.println("Saldo da Conta: " + meuSonho.balance);
		
	}

}
