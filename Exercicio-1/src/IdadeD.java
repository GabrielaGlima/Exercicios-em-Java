/*1 - Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias). */
import javax.swing.JOptionPane;

public class IdadeD {
    public void Contagem(){
        int Idade, diasA=0, diasM=0, Tdias=0;
        
        for(int i = 0; i < 3; i++){
            Idade = Integer.parseInt(JOptionPane.showInputDialog(
            "Informe a idade da pessoa(primeiro anos, depois meses e dias):"));
            if(i==0){
                diasA = Idade*365;
            }
            if(i==1){
                diasM = Idade*30;
            }
            if(i==2){
                Tdias = diasA + diasM + Idade;
            }
        }
        JOptionPane.showMessageDialog(null, "A pessoa viveu um total de"+ Tdias +"dias.");
    }
}
