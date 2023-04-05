package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    
    public static void main(String[] args) {
        
        Scanner rt = new Scanner(System.in);
        
        double valorCompra;
        double prestacao;
        
        System.out.println("Qual o valor da compra? ");
        valorCompra = rt.nextDouble();
        
        prestacao = valorCompra/5;
        
        System.out.printf("O valor da prestação será: %.2f%n  ", prestacao);
        
        rt.close();
    }
}
