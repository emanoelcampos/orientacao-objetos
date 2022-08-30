package OrientacaoObjetos;

public class ContaCorrente {

    private String numeroConta;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialUsado;

    public ContaCorrente() {}

    public ContaCorrente(String numeroConta, double saldo, boolean especial, double limiteEspecial, double valorEspecialUsado) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public double setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
        return limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public boolean realizarSaque(double quantiaSaque){
        //tem saldo na conta
        if(this.getSaldo() >= quantiaSaque){
            setSaldo(getSaldo() - quantiaSaque);
            return true;
        }else { //não tem saldo na conta
            if(this.getEspecial()){
                //verificar se o limite tem saldo
                double limite = setLimiteEspecial(getLimiteEspecial() + getSaldo());
                if (limite >= quantiaSaque){
                    setSaldo(getSaldo() - quantiaSaque);
                    return true;
                }else {
                    return false;
                }
            } else{
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }


    public void depositar(double quantiaDeposito){
        this.setSaldo(getSaldo() + quantiaDeposito);
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual da conta = " +getSaldo());
    }

    public boolean verificarUsoChequeEspecial(){
        return getSaldo() < 0;
    }















}
