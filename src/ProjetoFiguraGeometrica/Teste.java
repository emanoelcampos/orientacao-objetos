package ProjetoFiguraGeometrica;

public class Teste {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.setNome("Círculo");
        circulo.setCor("Azul");
        circulo.setRaio(2);

        Quadrado quadrado = new Quadrado();
        quadrado.setNome("Quadrado");
        quadrado.setCor("Branco");
        quadrado.setLado(2);

        Triangulo triangulo = new Triangulo();
        triangulo.setNome("Triângulo");
        triangulo.setCor("Verde");
        triangulo.setBase(3);
        triangulo.setAltura(2);

        Cubo cubo = new Cubo();
        cubo.setNome("Cubo");
        cubo.setCor("Preto");
        cubo.setLado(3);

        Cilindro cilindro = new Cilindro();
        cilindro.setNome("Cilíndro");
        cilindro.setCor("Amarelo");
        cilindro.setRaio(2);
        cilindro.setAltura(3);

        Piramide piramide = new Piramide();
        piramide.setNome("Pirâmide");
        piramide.setCor("Vermelho");
        piramide.setBase(quadrado);
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setNumPoliBase(4);
        piramide.setArestaBase(2);

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = circulo;
        figuras[1] = quadrado;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        /*for(FiguraGeometrica figura : figuras){
            System.out.println("--------------------");
            System.out.println(figura.getNome()+" "+figura.getCor());

            if(figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                System.out.println(f2d.calcularArea());
            }

            if(figura instanceof Figura3D){
                Figura3D f3d = (Figura3D) figura;
                System.out.println(f3d.calcularArea());
                System.out.println(f3d.calcularVolume());
            }
        }*/

        for (FiguraGeometrica figura : figuras){
            if(figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                System.out.println(f2d);
            }

            if(figura instanceof Figura3D){
                Figura3D f3d = (Figura3D) figura;
                System.out.println(f3d);

            }
        }
    }


}
