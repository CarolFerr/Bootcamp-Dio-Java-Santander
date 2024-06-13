public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numeroConta, Cliente cliente) {
        super(agencia, numeroConta, cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfoBancaria();
    }


}
