package ProjetoFiguraGeometrica;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.getLado()*getLado();
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Área = " + this.calcularArea()+"\n";

    }
}
