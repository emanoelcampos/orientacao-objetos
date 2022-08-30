package OrientacaoObjetos;

import java.util.Scanner;

public class AgendaTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda:");
        String nomeAgenda = scan.nextLine();
        Agenda ag = new Agenda(nomeAgenda);

        ContatoAgenda[] contatos = new ContatoAgenda[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Entre com as informações do contato "+(i+1));
            ContatoAgenda c = new ContatoAgenda();

            System.out.println("Entre com o nome:");
            String nome = scan.nextLine();
            c.setNome(nome);
            System.out.println("Entre com o telefone:");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            System.out.println("Entre com o email:");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        ag.setContatos(contatos);

        if(ag != null) {
            System.out.println(ag.obterInfo());
        }
    }
}
