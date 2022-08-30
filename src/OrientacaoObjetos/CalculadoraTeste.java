package OrientacaoObjetos;

import java.util.Scanner;

public class CalculadoraTeste {

    /*static void imprimirTela(double num){
        System.out.println(num);
    }*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*int num;
        do{
            System.out.println("Entre com o número positivo");
            num = scan.nextInt();

            if(num < 0){
                System.out.println("Número inválido, entre novamente");
            }
        }while (num < 0);

        System.out.println(Calculadora.fatorialNaoRecursivo(num));*/

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialR);



    }
}

