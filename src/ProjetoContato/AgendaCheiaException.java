package ProjetoContato;

public class AgendaCheiaException extends Exception{

    public String getMessage(){
        return "Agenda já está cheia";
    }
}
