package ProjetoContaBancaria;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double qtdSaque){
        if(qtdSaque <= getSaldo()){
            this.setSaldo(getSaldo() - qtdSaque);
            return true;
        }
        return false;
    }


    public void depositar(double qtdDeposito){
        this.setSaldo(getSaldo()+qtdDeposito);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
