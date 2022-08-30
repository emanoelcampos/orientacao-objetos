package ProjetoImpostoRenda;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta()*0.1;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica{" +
                super.toString()+ '\'' +
                "cnpj='" + cnpj + '\'' +
                "imposto a ser pago=" +calcularImposto()+ '\'' +
                '}';
    }
}
