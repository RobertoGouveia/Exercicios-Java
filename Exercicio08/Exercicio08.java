package exercicio08;

import java.util.Scanner;

public class Exercicio08 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        double real;
        double cotacao;
        double quantidadeDolar;
        
        System.out.println("Quantidade de Dólares: ");
        quantidadeDolar = sc.nextDouble();
        
        System.out.println("Valor da cotação: ");
        cotacao = sc.nextDouble();
                
        real = quantidadeDolar * cotacao;
        
        System.out.println("Valor em Reais: " + real);         
    } 
}
