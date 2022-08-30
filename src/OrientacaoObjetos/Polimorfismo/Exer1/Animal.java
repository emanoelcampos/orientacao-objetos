package OrientacaoObjetos.Polimorfismo.Exer1;

public abstract class Animal {
    private double peso;
    private int idade;
    private int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
