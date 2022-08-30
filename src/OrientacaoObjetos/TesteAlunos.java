package OrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class TesteAlunos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        scan.useLocale(Locale.ENGLISH);

        Alunos aluno = new Alunos();

        System.out.println("Entre com o nome do aluno:");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso:");
        aluno.setNomeCurso(scan.next());

        System.out.println("Entre com a matricula:");
        aluno.setMatricula(scan.next());


        for(int i = 0; i<aluno.getNomeDisciplinas().length; i++){
            System.out.println("Entre com o nome da disciplina " +i);
            aluno.setNomeDisciplina(i, scan.next());
        }


        for(int i = 0; i<aluno.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas da disciplina " +aluno.getNomeDisciplinas()[i]);
            for(int j = 0; j<aluno.getNotasDisciplinas()[i].length; j++){
                System.out.println("Entre com a nota " +(j+1));
                aluno.setNomePosIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for(int i = 0; i<aluno.getNomeDisciplinas().length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina " +aluno.getNomeDisciplinas()[i] + "  - foi APROVADO");
            }else{
                System.out.println("Disciplina " +aluno.getNomeDisciplinas()[i] + "  - foi REPROVADO");
            }
        }














    }
}
