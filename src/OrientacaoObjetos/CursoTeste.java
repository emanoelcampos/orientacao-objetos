package OrientacaoObjetos;

import java.util.Scanner;

public class CursoTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso:");
        String nomeCur = scan.nextLine();
        System.out.println("Entre com o horário do curso:");
        String horarioCur = scan.nextLine();

        System.out.println("Entre com o nome do professor:");
        String nomeProf = scan.nextLine();
        System.out.println("Entre com o departamento do professor:");
        String depProf = scan.nextLine();
        System.out.println("Entre com o email do professor:");
        String emailProf = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nomeCur);
        curso.setHorario(horarioCur);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("-----Alunos-----");
        Aluno[] alunos = new Aluno[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Entre com o nome do aluno:");
            String nomeAluno = scan.nextLine();
            System.out.println("Entre com a matrícula do aluno:");
            String matriculaAluno = scan.nextLine();

            double[] notas = new double[4];
            for(int j = 0; j < 4; j++){
                System.out.println("Entre com as notas do aluno:");
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;

        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
}
