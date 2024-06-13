public class Main {
    public static void main(String[] args) {

        /* tanto faz colocar Conta, ContaCorrente ou IConta, pois se é entendido que
        a ContaCorrente herda de conta, e a Conta implementa IConta
        Porém se atentar para o detalhe de que ao instanciar o objeto
        por meio da interface IConta, é necessário criar o método
        imprimirInfoBancaria na Interface, e chamar ao lado da intancia
        no caso cp a classe Conta, da seguinte manerira:
        IConta cc = new ContaCorrente(agencia, numeroConta)
        cc.transferir(valor, (Conta) cp)*/

        // Instancias criadas tanto da Classe Banco quanto da Classe Cliente para manipulação dos objetos
        Cliente maria = new Cliente("Maria");
        Cliente ana = new Cliente("Ana");
        Banco bc = new Banco();
        ContaCorrente cc = new ContaCorrente(1, 123456, maria);
        ContaPoupanca cp = new ContaPoupanca(1, 987654, ana);

        // Chamada dos métodos para adicionar os clientes na lista de clientes
        bc.adicionarCliente("Maria");
        bc.adicionarCliente("Ana");


        // Chamada dos métodos para adicionar as contas na lista de contas
        bc.adicionarContaCorrente(cc);
        bc.adicionarContaPoupanca(cp);


        // Chamada dos métodos para realizar as operações de deposito, saque e transferência
        cc.depositar(500);
//        cc.sacar(550);
        cc.transferir(1000, cp);

        // Extrato
        cc.imprimirInfoBancaria();
        System.out.println("========================================================");
        cp.imprimirInfoBancaria();

        // Informaçoes do Banco
        System.out.println("========================================================");
        bc.infoBanco();

    }
}