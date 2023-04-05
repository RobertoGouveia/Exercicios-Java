
package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        float n1, n2, resultadoSoma, resultadoSubtracao, resultadoMultiplicacao,
        resultadoDivisao;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        resultadoSoma = n1+n2;
        resultadoSubtracao = n1-n2;
        resultadoMultiplicacao = n1*n2;
        resultadoDivisao = n1/n2;
        
        System.out.println("O resultado da soma é: " + resultadoSoma);
        System.out.println("O resultado da subtracao é: " + resultadoSubtracao);
        System.out.println("O resultado da multiplicacao é: " + resultadoMultiplicacao);
        System.out.println("O resultado da divisao é: " + resultadoDivisao);
        



        
        
    }
    
}
