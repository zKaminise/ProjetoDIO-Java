import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        ContaTerminal cliente = new ContaTerminal();

        System.out.println("Digite o seu nome:");
        cliente.nomeCliente = dados.nextLine();

        System.out.println("Numero da Agencia:");
        cliente.agencia = dados.next();

        System.out.println("Numero da Conta:");
        cliente.numero = dados.nextInt();

        System.out.println("Saldo da conta bancaria:");
        cliente.saldo = dados.nextInt();

        cliente.dadosInseridos();

        dados.close();

    }
}