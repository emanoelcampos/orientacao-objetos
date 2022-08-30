package OrientacaoObjetos.Polimorfismo.Exer1;

public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Constrói ninhos para morar");
    }

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar(){
        System.out.println("Insetos");
    }

    @Override
    public void emitirSom(){
        System.out.println("Sons de ave");
    }

}
