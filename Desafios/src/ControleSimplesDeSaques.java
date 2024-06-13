import java.util.Scanner;


public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; limiteDiario > i; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                // Realiza o saque e atualiza o limite diário
                limiteDiario -= valorSaque;
                // Informa ao usuário que o saque foi realizado e mostra o limite restante
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }
        scanner.close();
    }
}

