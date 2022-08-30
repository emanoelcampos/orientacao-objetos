package ProjetoContaBancaria;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor){
        double saldoComLimite = this.getSaldo() + limite;
        if((saldoComLimite - valor) >=0){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                super.toString()+
                '}';
    }
}
