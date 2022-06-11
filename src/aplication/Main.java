package aplication;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;
        double initialDeposit = 0.00;

        System.out.print("Coloque o número da conta: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Coloque o nome do usuário: ");
        String holder = sc.nextLine();
        System.out.print("Gostaria de fazer um Depósito Inicial? (s/n)? ");
        char response = sc.next().charAt(0);

        if ( response == 's') {
            System.out.print("Coloque aqui o valor do depósito inicial:  ");
            initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Informações da Conta: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Coloque aqui o valor de depósito: ");

        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Informações da Conta Atualizadas: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Coloque aqui o valor de Retirada: ");

        double amountWithdraw = sc.nextDouble();
        account.withdraw(amountWithdraw);

        System.out.println("Informações da Conta Atualizadas: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Finalizando...");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Obrigado por usar nossos serviços!");


    }
}
