public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private static final int LIMITE_SAQUE = 3;
    private static final double VALOR_LIMITE= 1000;

    private String mensagemSaqueExcedido = "";
    private String mensagemTransferenciaFalhou = "";

    protected int agencia;
    protected int numeroConta;
    protected double saldo = 50 ;
    private final Cliente cliente;

    public Conta(int agencia, int numeroConta, Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor){
        for (int numeroSaque = 1; numeroSaque <= LIMITE_SAQUE; numeroSaque++) {
            if (valor < VALOR_LIMITE && valor > saldo){
                this.saldo = this.saldo - valor;
                break;
            }else {
                mensagemSaqueExcedido = "Saque Excedido, saldo insuficiente para realizacao da operacao!";
            }
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        for (int numeroSaque = 1; numeroSaque <= LIMITE_SAQUE; numeroSaque++) {
            if (valor < VALOR_LIMITE && valor > saldo){
                this.sacar(valor);
                contaDestino.depositar(valor);
                break;
            }else {
                mensagemTransferenciaFalhou = "Não foi possível realizar a transferencia. Saldo Inválido!";
            }
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    protected void imprimirInfoBancaria() {
        System.out.println("=== Dados Conta dos Clientes ===");
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numeroConta);
        System.out.printf("Saldo: %.2f\n", this.saldo);

        if (!mensagemSaqueExcedido.isEmpty()) {
            System.out.println(mensagemSaqueExcedido);
        }
        if (!mensagemTransferenciaFalhou.isEmpty()) {
            System.out.println(mensagemTransferenciaFalhou);
        }
    }


}
