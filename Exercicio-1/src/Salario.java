/*3 - Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado  (1SM=R$1.320,00).*/
import javax.swing.JOptionPane;

public class Salario {
    public void Conta() {
        float Salario, calc, SM;

        SM = Integer.parseInt(JOptionPane.showInputDialog("Insira o Salário Mínimo"));
        Salario = Integer.parseInt(JOptionPane.showInputDialog("Insira o Salário do Usuário"));
        calc = Salario/SM;
        JOptionPane.showMessageDialog(null, "O usuário ganha um total de "+calc+"SM = "+Salario+" Reais");
    }

}