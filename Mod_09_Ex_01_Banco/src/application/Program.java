package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o
		 * n�mero da conta, o nome do titular da conta, e o valor de dep�sito inicial
		 * que o titular depositou ao abrir a conta. Este valor de dep�sito inicial,
		 * entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar
		 * no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
		 * inicial da conta ser�, naturalmente, zero. Importante: uma vez que uma conta
		 * banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� o nome
		 * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o
		 * de casamento, por exemplo). Por fim, o saldo da conta n�o pode ser alterado
		 * livremente. � preciso haver um mecanismo para proteger isso. O saldo s�
		 * aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada
		 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar
		 * com saldo negativo se o saldo n�o for suficiente para realizar o saque e/ou
		 * pagar a taxa. Voc� deve fazer um programa que realize o cadastro de uma
		 * conta, dando op��o para que seja ou n�o informado o valor de dep�sito
		 * inicial. Em seguida, realizar um dep�sito e depois um saque, sempre mostrando
		 * os dados da conta ap�s cada opera��o.
		 */
		
<<<<<<< HEAD
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		 		 
=======
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
>>>>>>> eec9fb52425faf9ce7393f5f334efa14917d5ee4
		 //instanciando conta
		 Account account;
		 
		 System.out.print("Enter account number: ");
<<<<<<< HEAD
		 int accountNumber = sc.nextInt();
		 sc.nextLine();
		 System.out.print("Enter account holder: ");
		 String accountOwner = sc.nextLine();
		 System.out.print("Is there an initial deposit (y/n)? ");
=======
		 int number = sc.nextInt();
		 sc.nextLine();
		 System.out.print("Enter account holder: ");
		 //String holder = sc.nextLine();
		 System.out.println("Is there an initial deposit (y/n)? ");
>>>>>>> eec9fb52425faf9ce7393f5f334efa14917d5ee4
		 char response = sc.next().charAt(0);
		 sc.nextLine();
		 
		 if(response == 'y') {
			 System.out.print("Enter initial deposit value: ");
			 double initialDeposit = sc.nextDouble();
			 account = new Account(accountNumber, accountOwner, initialDeposit);
		 }
		 else {
			 account = new Account(accountNumber, accountOwner);
		 }
<<<<<<< HEAD
		 
		 //Mostrando na tela os dados da conta
		 System.out.println();
		 System.out.println("Account data: ");
		 System.out.println(account);
		 
		 //Realizando deposito
		 System.out.println();
		 System.out.print("Enter a deposit value: ");
		 double depositValue = sc.nextDouble();
		 account.deposit(depositValue);
		 System.out.println("Updated account data");
		 System.out.println(account);
		 
		 //Realizando saque
		 System.out.println();
		 System.out.print("Enter a withdraw value: ");
		 double withdrawValue = sc.nextDouble();
		 account.withdraw(withdrawValue);
		 System.out.println("Updated account data: ");
		 System.out.println(account);
		 
=======
		 
		 //Mostrando na tela os dados da conta
		 System.out.println();
		 System.out.println("Account data: ");
		 
>>>>>>> eec9fb52425faf9ce7393f5f334efa14917d5ee4
		 sc.close();
	}
		
}