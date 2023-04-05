package exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();
        
        
        if (numero >= 100 && numero <= 200){
            System.out.println("O número está entre 100 e 200.");        
        }else{
            System.out.println("O número não está entre 100 e 200.");
        }
        
        leitor.close();
    } 
}
