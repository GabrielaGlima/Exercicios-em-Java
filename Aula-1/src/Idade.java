/*1 - faça um programa para saber se a pessoa está apta a votar ou não. */
import javax.swing.JOptionPane;

public class Idade {
    public void imprimir(){

        //variaveis
        int idade;

        //entrada de dados 
        idade = Integer.parseInt(JOptionPane.showInputDialog(
            "Informe a idade do eleitor"));
    
        //processamento
        if(idade < 16){
            JOptionPane.showMessageDialog(null,
            "O eleitor tem " + idade + " anos e ainda não pode votar");
        }

        if(idade >= 16 && idade < 18){
            JOptionPane.showMessageDialog(null,
            "O eleitor tem " + idade + " anos e o voto é facultativo");
        }
        if(idade >= 18 && idade < 60){
            JOptionPane.showMessageDialog(null,
            "O eleitor tem " + idade + " anos e o voto é obrigatorio");
        }
    }
}
