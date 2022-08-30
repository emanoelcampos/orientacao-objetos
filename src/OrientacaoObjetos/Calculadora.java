package OrientacaoObjetos;

public class Calculadora {

    public static double soma(double num1, double num2){
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }

    public static double mult(double num1, double num2){
        return num1 * num2;
    }

    public static double divisao(double num1, double num2){
        return num1 / num2;
    }

    public static double potencia(double num1, double num2){
        return Math.pow(num1,num2);
    }

    public static int fatorialNaoRecursivo(int num){
        if(num == 0){
            return 1;
        }
        int total = 1;
        for(int i = num; i>1; i--){
            total*=i; //total = total*i;
        }
        return total;
    }

    public static int fatorialRecursivo(int num){

        if(num == 0){
            return 1;
        }
        return num * fatorialRecursivo(num-1);
    }


}
