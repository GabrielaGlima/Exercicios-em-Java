/*7 - Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em graus Celsius. */

import javax.swing.JOptionPane;

public class Temperatura {
    public void converter(){
        int C,F;

        F = Integer.parseInt(JOptionPane.showInputDialog(
            "Qual a Temperatura em Fahrenheit a ser convertida:"));

        C = (F - 32)*5/9;

        JOptionPane.showMessageDialog(null, 
        "A temperatura em celsius é:"+ C);
    }
}