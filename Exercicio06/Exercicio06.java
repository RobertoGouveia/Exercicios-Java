package exercicio06;

import java.util.Scanner;

public class Exercicio06 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.println("Valor A: ");
        a = sc.nextInt();
        
        System.out.println("Valor B: ");
        b = sc.nextInt();
        
        int troca = a;
        a = b;
        b = troca;
        
        System.out.println("O valor de A é " + a + " e o valor de B é " + b );
        
        sc.close();
    }
}
