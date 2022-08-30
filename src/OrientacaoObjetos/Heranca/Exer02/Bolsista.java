package OrientacaoObjetos.Heranca.Exer02;

public class Bolsista extends Aluno{
    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno " +getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Aluno " +getNome()+ " tem pagamento facilitado.");
    }

}
