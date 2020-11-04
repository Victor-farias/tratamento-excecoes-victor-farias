package application_excecoes;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptionFixacao;

public class ExercicioFixacao {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter account data: ");
	System.out.print("Number: ");
	Integer number = sc.nextInt();
	System.out.print("Holder: ");
	sc.nextLine();
	String holder = sc.nextLine();
	System.out.print("Initial balance: ");
	Double balance = sc.nextDouble();
	System.out.print("Withdraw limit: ");
	Double withdrawLimit = sc.nextDouble();
	
	Account account = new Account(number, holder, balance, withdrawLimit);
	
	System.out.print("Enter amount for withdraw: ");
	Double amount = sc.nextDouble();
	
	try {
		account.withdraw(amount);
		System.out.printf("New balance: %.2f%n", account.getBalance());
	}
	catch(DomainExceptionFixacao e) {
		System.out.println(e.getMessage());
	}
	catch(RuntimeException e) {
		System.out.println("Unexpected error.");
	}
	sc.close();

	}

}
