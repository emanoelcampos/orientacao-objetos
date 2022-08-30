package OrientacaoObjetos;

public class ContadorTeste {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }

    public static void main(String[] args) {

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        imprimirValor();

    }
}
