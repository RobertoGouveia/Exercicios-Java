package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
 
    public static void main(String[] args) {
        
        int numeroUm, numeroDois, resultado;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite dois Numero: ");
        numeroUm = s.nextInt();
        numeroDois = s.nextInt();
        resultado = numeroUm + numeroDois;
        System.out.println("O resultado da soma é : " + resultado);
        
        
        
    }
    
}
