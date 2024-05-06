
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto da classe scanner

        Scanner scanner = new Scanner(System.in);

        // entradas do usuario

        System.out.println("Entre com o numero da sua conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Entre com o numero da sua agencia:");
        String numeroAgencia = scanner.next();
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        // impressao dos dados solicitados

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco sua agência é %s, conta %d e seu saldo" +
                        " inicial de R$%.2f já está disponível para saque.",
                nomeCliente, numeroAgencia, numeroConta, saldo);


    }
}
