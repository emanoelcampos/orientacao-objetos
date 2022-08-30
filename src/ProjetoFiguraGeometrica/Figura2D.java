package ProjetoFiguraGeometrica;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial{

    @Override
    public String toString() {
        return "Nome: " +this.getNome()+"\n"+
                "Cor: " +this.getCor()+"\n";
    }
}
