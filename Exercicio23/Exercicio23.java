package exercicio23;

import java.util.Scanner;

public class Exercicio23 {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        float numero;
        
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();
        
        if(numero>80 || numero<25 || numero==40){
            System.out.println("O número está dentro do intervalo.");
        }else{
            System.out.println("O número está fora do intervalo.");
        }
        
        leitor.close();
    }
    
}
