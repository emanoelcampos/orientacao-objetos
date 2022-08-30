package OrientacaoObjetos;

public class Agenda {
    private String nomeAgenda;
    private ContatoAgenda[] contatos;

    public Agenda() {}

    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public ContatoAgenda[] getContatos() {
        return contatos;
    }

    public void setContatos(ContatoAgenda[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Nome da agenda = "+nomeAgenda+ "\n";

        if(contatos != null){
            for(ContatoAgenda c : contatos){
                info+= c.obterInfo() +"\n";
            }
        }

        return info;
    }
}
