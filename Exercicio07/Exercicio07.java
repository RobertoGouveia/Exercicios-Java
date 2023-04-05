package exercicio07;

import java.util.Scanner;


public class Exercicio07 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double c;
       
        
        System.out.println("Temperatura em graus Celsius: ");
        c = sc.nextDouble();
        
        double f = (9*c+160) / 5; 
        
        System.out.println("A temperatura em graus Fahrenheit é " + f );
        
        sc.close();
    }
}
