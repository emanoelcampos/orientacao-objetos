package OrientacaoObjetos.Polimorfismo.Exer1;

public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Solta bolhas na água");
    }

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Partículas do água");
    }

    @Override
    public void emitirSom(){
        System.out.println("Sons de peixe");
    }
}
