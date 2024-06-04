import java.util.Scanner;

public class ContaTerminal {

    public static void main (String []args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numero = scan.nextInt();

        System.out.println("Digite sua agência: ");
        String agencia = scan.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scan.next();

        System.out.println("Qual seu saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("**********************************************************************");
        System.out.println("Olá "+ nomeCliente + ",Obrigado por criar uma conta em nosso Banco :) ");
        System.out.println("Agência :  "  +  agencia  +  "  Conta  "  +  numero);
        System.out.println ("Seu saldo Já está disponível para saque " +saldo);
        System.out.println("**********************************************************************");
    }

}


