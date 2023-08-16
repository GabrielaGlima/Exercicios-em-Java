/*5 - Faça um programa para calcular o estoque médio de uma peça, sendo que: ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2. */

import javax.swing.JOptionPane;

public class Estoque {
    public void Peças(){
        int Peça,Quant_max,Quant_min; 
        
        Quant_max = Integer.parseInt(JOptionPane.showInputDialog(
            "Insira as informações (respectivamente quantidade mínima)"));
        Quant_min = Integer.parseInt(JOptionPane.showInputDialog(
            "Insira as informações (respectivamente quantidade máxima)"));

        Peça = (Quant_max + Quant_min)/2;
        JOptionPane.showMessageDialog(null, 
        "O estoque médio de perças é:"+ Peça);
    }
}
    
