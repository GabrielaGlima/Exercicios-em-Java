/*1- Construa um programa para determinar se o indivíduo está com um peso adequado. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo.*/

import javax.swing.JOptionPane;

public class Imc {
    public void peso(){
        float imc,peso,altura;

        peso = Integer.parseInt(JOptionPane.showInputDialog(
            "Escreva o seu peso"));
        altura = Integer.parseInt(JOptionPane.showInputDialog(
            "Escreva a sua altura:"));

        imc = peso/(altura * altura);

        if(imc<20){
            JOptionPane.showMessageDialog(null, 
                "O individuo está abaixo do peso:");
        }
        if(imc<25 && imc>=20){
            JOptionPane.showMessageDialog(null, 
                "O individuo está com peso normal:");
        }
        if(imc<30 && imc>=25){
            JOptionPane.showMessageDialog(null, 
                "O individuo está sobre peso:");
        }
        if(imc<40 && imc>=30){
            JOptionPane.showMessageDialog(null, 
                "O individuo está obeso:");
        }
        if(imc>=40){
            JOptionPane.showMessageDialog(null, 
                "O individuo está obeso mórbido:");
        }
    }
}
