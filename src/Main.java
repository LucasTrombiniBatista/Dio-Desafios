public class Main {
    
    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        
        cc.depositar(100);
        poupanca.depositar(200);
        cc.transferir(50, poupanca);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + poupanca.getSaldo());

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
