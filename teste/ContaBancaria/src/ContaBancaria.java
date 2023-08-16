public class ContaBancaria{
    private int Numconta;
    
    private double saldo;

    public ContaBancaria(int conta, double saldoInicial) {
        this.Numconta = conta;
        this.saldo = saldoInicial;
    }
    public void Depositar(double valor) {
        saldo+= valor;
    }
    public boolean sacar(double valor) {
        if(saldo >= valor){
            saldo-=valor;
            return true;
        }
        return false;
    }
    public double consultarSaldo() {
        return saldo;
    }
    public String toString() {
        return "Conta Bancária - Número: "+Numconta+", Saldo: R$"+saldo;
    }
}
    
