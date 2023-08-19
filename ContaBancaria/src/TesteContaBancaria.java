/*Você está desenvolvendo um sistema bancário simples em Java para gerenciar contas bancárias. Crie uma classe chamada ContaBancaria que tenha os seguintes atributos e métodos: o número da conta bancária, o saldo atual da conta, depositar que adiciona o valor especificado ao saldo da conta, sacar que subtrai o valor especificado do saldo da conta, desde que haja saldo suficiente, consultarSaldo que retorna o saldo atual da conta e o toString que retorna uma representação em formato de string da conta bancária, contendo o número da conta e o saldo. Agora, crie uma classe chamada TesteContaBancaria que contenha o método main. No método main, realize as seguintes operações:
a)Crie duas instâncias da classe ContaBancaria, uma com o número de conta 123 e saldo inicial de 1000, e outra com o número de conta 456 e saldo inicial de 500.
b)Realize algumas operações de depósito e saque em ambas as contas.
c)Imprima o saldo final das contas após as operações.
 */
import javax.swing.JOptionPane;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(123, 1000);
        ContaBancaria conta2 = new ContaBancaria(456, 500);

        double Deposito1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado na conta 123:"));
        conta1.Depositar(Deposito1);

        double Saque1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado na conta 123:"));
        
        if(conta1.sacar(Saque1)) {
            JOptionPane.showMessageDialog(null, "O saque foi realizao com sucesso.");
        }else{
            JOptionPane.showMessageDialog(null, "O saldo é insuficiente para o valor de saque pedido.");
        }
        
        double Deposito2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado na conta 456:"));
        conta2.Depositar(Deposito2);

        double Saque2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado na conta 456:"));
        
        if(conta2.sacar(Saque2)) {
            JOptionPane.showMessageDialog(null, "O saque foi realizao com sucesso.");
        }else{
            JOptionPane.showMessageDialog(null, "O saldo é insuficiente para o valor de saque pedido.");
        }
        
        JOptionPane.showMessageDialog(null, conta1.toString());
        JOptionPane.showMessageDialog(null, conta2.toString());
    }
}