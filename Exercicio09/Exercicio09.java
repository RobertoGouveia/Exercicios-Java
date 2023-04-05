package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double valorDeposito;
        double juros = 0.07;
        
        System.out.println("Valor depositado: ");
        valorDeposito = sc.nextDouble();
        
        double rendimento = valorDeposito * juros;
        double valorFinal = rendimento + valorDeposito;
        
        System.out.printf("O valor do rendimento após um mês: %.2f%n ", rendimento);
        System.out.printf("O valor final do investimento foi: %.2f%n ", valorFinal);
        
        sc.close();        
    }
    
}
