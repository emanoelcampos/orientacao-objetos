package OrientacaoObjetos.Heranca.Exer01;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Emanoel");
        p2.setNome("Ana");
        p3.setNome("David");
        p4.setNome("Lucas");

        p1.setIdade(25);
        p2.setIdade(58);
        p3.setIdade(27);
        p4.setIdade(22);

        p1.fazerAniver();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p2.setCurso("Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");



    }
}
