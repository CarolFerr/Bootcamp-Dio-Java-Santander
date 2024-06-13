import java.util.ArrayList;
import java.util.List;

public class Banco {

    private final String nome = "Santander";
    private final List<ContaCorrente> contasCorrente;
    private final List<ContaPoupanca> contasPoupanca;
    private final List<Cliente> clientes;

    public Banco() {
        this.contasCorrente = new ArrayList<>();
        this.contasPoupanca = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // A lógica dos métodos adicionarConta se repetem para se obter um maior controle sobre as listas individualmente
    public void adicionarContaCorrente(ContaCorrente contaCorrente) {
        contasCorrente.add(contaCorrente);
    }

    public void adicionarContaPoupanca(ContaPoupanca contaPoupanca) {
        contasPoupanca.add(contaPoupanca);
    }
    // Outra maneira de implementação dos métodos acima
    //    public void adicionarContaCorrente(ContaCorrente contaCorrente) {
//        ContaCorrente contaCorrente = new ContaCorrente(contaCorrente);
//        contasCorrente.add(contaCorrente);
//    }

    public void adicionarCliente(String nome) {
        clientes.add(new Cliente(nome));
    }

    // Outra maneira de implementar o método adicionarCliente
    //    public void adicionarCliente(String nome) {
//        Cliente cliente = new Cliente(nome);
//        clientes.add(cliente);
//    }

    // A lógica dos métodos obterNumeroTotalContas se repetem para se obter um maior controle sobre o total de contas de cada lista
    public int obterNumeroTotalContasCorrente() {
        return contasCorrente.size();
    }

    public int obterNumeroTotalContasPoupanca() {
        return contasPoupanca.size();
    }

    public int obterNumeroTotalClientes() {
        return clientes.size();
    }

    public List<ContaCorrente> getContasCorrente() {
        return contasCorrente;
    }

    public List<ContaPoupanca> getContasPoupanca() {
        return contasPoupanca;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    protected void infoBanco() {
        System.out.println("=== Dados Coletados do Banco para Análise de Mercado ===");
        int numeroContasPoupanca = this.obterNumeroTotalContasPoupanca();
        int numeroContasCorrente = this.obterNumeroTotalContasCorrente();
        int numeroClientes = this.obterNumeroTotalClientes();

        System.out.printf("Numero Total de Contas Poupanca: %d\n", numeroContasPoupanca);
        System.out.printf("Numero Total de Contas Corrente: %d\n", numeroContasCorrente);
        System.out.printf("Numero Total de Clientes: %d\n", numeroClientes);
    }

}
