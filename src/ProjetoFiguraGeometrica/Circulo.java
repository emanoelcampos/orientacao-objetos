package ProjetoFiguraGeometrica;

public class Circulo extends Figura2D implements DimensaoSuperficial{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*(Math.pow(this.getRaio(), 2));
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Área = " + this.calcularArea()+"\n";

    }
}
