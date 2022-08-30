package OrientacaoObjetos;

public class ContatoTeste {
    public static void main(String[] args) {
        Contado contato = new Contado();
        contato.setNome("Emanoel");
        //contato.setEndereco("Blumenau");
        //contato.setTelefone("988387443");

        //criar objeto endereço:
        Endereco end = new Endereco();
        end.setNomeRua("Rua Goias");
        end.setNumero("363");
        end.setComplemento("casa 2");
        end.setCep("89021-300");
        end.setCidade("Blumenau");
        end.setEstado("SC");
        contato.setEndereco(end);

        //criar objeto telefone:
        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd("47");
        tel.setNumero("98838-7443");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Celular");
        tel2.setDdd("11");
        tel2.setNumero("98841-5684");
        //contato.setTelefone(tel);

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;
        contato.setTelefones(telefones);

        //teste de saída no console
        System.out.println(contato.getNome());
        //condição de segurança
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd()+" "+contato.getTelefone().getNumero());
        }*/

        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd()+" "+t.getNumero());
            }

        }



    }
}
