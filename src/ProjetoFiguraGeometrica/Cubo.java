package ProjetoFiguraGeometrica;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6*(Math.pow(getLado(), 2));
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.getLado(), 3);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Área: " +this.calcularArea()+ "\n"+
                "Volume: " +this.calcularVolume()+ "\n";
    }
}
