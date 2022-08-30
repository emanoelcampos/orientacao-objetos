package ProjetoZoo;

public class Peixe extends Animal{
    private String caracteristicas;

    public Peixe() {
        this.setNumPatas(0);
        this.setAmbiente("mar");
        this.setCor("cinza");
        this.caracteristicas = "barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
