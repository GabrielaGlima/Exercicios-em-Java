/*2 - faça um programa que imprima os numeros pares em ordem decrescende entre 101 e 299.*/
public class Intervalo {
    public void imprimir(){
        for(int i = 299; i>101; i--){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
