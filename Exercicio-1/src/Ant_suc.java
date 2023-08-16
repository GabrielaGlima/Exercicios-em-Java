/*4 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor. */
import javax.swing.JOptionPane;

public class Ant_suc {
    public void SuceAnte() {
        int inteiro, sucessor, antecessor;

        inteiro = Integer.parseInt(JOptionPane.showInputDialog(
            "Dê um número inteiro:"));
        sucessor = inteiro+1;
        antecessor = inteiro-1;

        JOptionPane.showMessageDialog(null, 
            "O antecessor do número "+inteiro+ " é o número "+antecessor+" e o seu sucessor é o número "+sucessor);
    }

}