/*2 - Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias).
 */
import javax.swing.JOptionPane;

public class Ipi {
    public void Porcentagem() {
        int Peça, quant1=0, quant2=0, valor1=0, valor2=0, cod1=0, cod2=0, porcent;

        porcent = Integer.parseInt(JOptionPane.showInputDialog(
                    "Qual a porcentagem do IPI a ser acrescido nas peças:"));
            porcent = porcent/100 + 1;
        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                if(j<3){
                    if(i==0){
                        Peça = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insira as informações da peça 1 (respectivamente código, preço unitário e quantidade):"));
                    }
                    else{
                        Peça = Integer.parseInt(JOptionPane.showInputDialog(
                    "Insira as informações da peça 2 (respectivamente código, preço unitário e quantidade):"));
                    }
                if(j==0){
                    if(i==0){
                        cod1 = Peça;
                    }
                    else
                        cod2 = Peça; 
                }
                if(j==1){
                    if(i==0){
                        valor1 = Peça;
                    }
                    else
                        valor2 = Peça; 
                }
                if(j==2){
                    if(i==0){
                        quant1 = Peça;
                    }
                    else
                        quant2 = Peça; 
                    }
                }
            }
        }
        valor1 = valor1*quant1;
        valor2 = valor2*quant2;
        Peça = (valor1 + valor2)*porcent;
        JOptionPane.showMessageDialog(null, 
        "O valor total a ser pago sobre os itens "+ cod1 +" e "+ cod2 + " é: "+ Peça +" Reais");
    }
}