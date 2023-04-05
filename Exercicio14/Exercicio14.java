package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);
        
        int numero1, numero2;
        
        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextInt();
        
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextInt();
        
        if(numero1 > numero2) {
            System.out.println("O maior número foi: "+numero1);        
        }else{
            System.out.println("O maior número foi: "+ numero2);
        }
        
        leitor.close();
    }
}
