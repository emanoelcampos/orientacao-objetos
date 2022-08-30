package OrientacaoObjetos;

public class Lampada {
    private String modelo;
    private String cor;
    private String tipoLuz;
    private double valor;
    private double potencia;
    private int garantia;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    public Lampada() {
        this.setLigada(false);
    }

    public void ligar(){
        this.setLigada(true);
    }

    public void desligar(){
        this.setLigada(false);
    }

    public void mostrarEstado(){
        if(this.getLigada()){
            System.out.println("Lâmpada está ligada");
        }else {
            System.out.println("Lâmpada está desligada");
        }
    }

    public void mudarEstado(){
        if(this.getLigada()){
            this.setLigada(false);
        }else{
            this.setLigada(true);
        }
    }

    private boolean getLigada() {
        return ligada;
    }
    private void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
