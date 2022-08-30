package ProjetoFiguraGeometrica;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
    private double raio;
    private double altura;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 2*(Math.PI*(Math.pow(this.getRaio(), 2))) + (Math.PI*(this.getRaio()* this.getAltura()));
    }

    @Override
    public double calcularVolume() {
        return Math.PI*(Math.pow(this.getRaio(), 2)* this.getAltura());
    }

    @Override
    public String toString() {
        return super.toString()+
                "Área: " +this.calcularArea()+ "\n"+
                "Volume: " +this.calcularVolume()+ "\n";
    }
}
