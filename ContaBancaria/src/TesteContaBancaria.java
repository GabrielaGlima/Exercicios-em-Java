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
        }else {
            JOptionPane.showMessageDialog(null, "O saldo é insuficiente para o valor de saque pedido.");
        }
        
        double Deposito2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado na conta 456:"));
        conta2.Depositar(Deposito2);

        double Saque2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado na conta 456:"));
        
        if(conta2.sacar(Saque2)) {
            JOptionPane.showMessageDialog(null, "O saque foi realizao com sucesso.");
        }else {
            JOptionPane.showMessageDialog(null, "O saldo é insuficiente para o valor de saque pedido.");
        }
        
        JOptionPane.showMessageDialog(null, conta1.toString());
        JOptionPane.showMessageDialog(null, conta2.toString());
    }
}