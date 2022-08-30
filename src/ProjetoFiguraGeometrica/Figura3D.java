package ProjetoFiguraGeometrica;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica{

    @Override
    public String toString() {
        return "Nome: " +this.getNome()+ "\n"+
                "Cor: " +this.getCor()+"\n";
    }
}
