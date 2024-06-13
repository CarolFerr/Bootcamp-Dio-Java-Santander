public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numeroConta, Cliente cliente) {
        super(agencia, numeroConta, cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoBancaria();
    }
}
