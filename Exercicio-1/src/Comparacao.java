/*6 - Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual. */
import javax.swing.JOptionPane;

public class Comparacao {
    public void Compara() {
        int inteiro1, inteiro2, Equal=2, MouM=2, MEq=2;

        inteiro1 = Integer.parseInt(JOptionPane.showInputDialog(
            "Dê um número inteiro para comparação:"));
        inteiro2 = Integer.parseInt(JOptionPane.showInputDialog(
            "Dê o outro número inteiro para ser comparado:"));
            
            for(int i=0; i<3; i++){
                if(i==0){
                    if(inteiro1==inteiro2){
                        Equal = 0;
                    }else
                        Equal = 1;
                    }
                if(i==1){
                        if(inteiro1>inteiro2){
                        MouM = 0;
                    }else
                        MouM = 1;
                    }
                if(i==2){
                    if(inteiro1>=inteiro2){
                        MEq = 0;
                    }else
                        MEq = 1;
                    }
                }
            if(Equal==0){
                if(MEq==0){
                    JOptionPane.showMessageDialog(null, 
                    "O número "+inteiro1+" é maior ou igual a "+inteiro2);
                }else
                    JOptionPane.showMessageDialog(null, 
                    "O número "+inteiro1+" é menor ou igual a "+inteiro2);
            }else{
                if(MouM==0){
                    JOptionPane.showMessageDialog(null, 
                    "O número "+inteiro1+" é não igual e maior que "+inteiro2);
                }else{
                    JOptionPane.showMessageDialog(null, 
                    "O número "+inteiro1+" é não igual e menor que "+inteiro2);
                }
            }
    }
}
