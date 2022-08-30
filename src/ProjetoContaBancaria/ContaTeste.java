package ProjetoContaBancaria;

public class ContaTeste {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNomeCliente("Cliente teste");
        conta.setNumConta("11111");

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNomeCliente("Cliente CP");
        cp.setNumConta("22222");

        System.out.println(cp);





    }
}
