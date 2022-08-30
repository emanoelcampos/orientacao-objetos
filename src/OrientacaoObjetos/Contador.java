package OrientacaoObjetos;

public class Contador {
    private static int cont;

    public Contador() {
        cont++;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Contador.cont = cont;
    }

    public static void incrementar(){
        setCont(getCont() +1);
    }

    public static void zerar(){
        setCont(0);
    }

    public static int obterValor(){
        return getCont();
    }
}
