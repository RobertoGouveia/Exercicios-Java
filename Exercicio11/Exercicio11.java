package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

 
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        double precoCusto, precoVenda, valorPercentual;
        double percentualAcrescimo = 0.0f;
        
        System.out.println("Qual o custo do produto? ");
        precoCusto = leitor.nextDouble();
        
        System.out.println("Qual o percentual sobre o custo? ");
        percentualAcrescimo = leitor.nextDouble();
        
        valorPercentual = precoCusto * percentualAcrescimo;
        precoVenda = valorPercentual + precoCusto;
        
        System.out.printf("O preço da venda foi de: %.2f%n", precoVenda);
        
        leitor.close();
   
    }
    
}
