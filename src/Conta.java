public abstract class Conta implements Iconta {
    
    protected static int AGENCIA_PADRAO = 1;
    
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;


    

    public Conta (){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    } 
    


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComuns() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
    }


}
