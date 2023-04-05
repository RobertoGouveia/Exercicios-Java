package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();
        
        if (numero > 10) {
            System.out.println("O número é maior que 10.");
        } else{
            System.out.println("O número é menor que 10.");
        }
        
        leitor.close();
    }
}
