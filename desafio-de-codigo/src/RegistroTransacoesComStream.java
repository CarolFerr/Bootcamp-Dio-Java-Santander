/*Você está aprimorando o programa anterior e agora deseja utilizar a Stream API do Java para processar as
        transações bancárias de forma mais eficiente.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.tipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.tipo() == 's') {
                saldo -= valorTransacao;
            }
        }

        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> String.format(transacao.tipo() + " de " +transacao.valor()))
                .toList()
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

record Transacao(char tipo, double valor) {
}