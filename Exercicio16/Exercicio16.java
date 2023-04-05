package exercicio16;

import java.util.Scanner;

public class Exercicio16 {


    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        double nota1, nota2, nota3, media;
   
        
        System.out.println("Digite o nome do aluno: ");
        nome = leitor.nextLine();
                    
        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();
        
        
        media = (nota1 + nota2 + nota3)/3;
        
        if (media >= 7){
            System.out.printf("O aluno " + nome + " está aprovado com a média: %.2f%n ", media);
        }
        if (media <= 5) {
            System.out.printf("O aluno " + nome + " está reprovado com a média: %.2f%n ", media);
        }
        if (media >= 5.1 && media <= 6.9) {
            System.out.printf("O aluno " + nome + " está em recuperação com a média: %.2f%n ", media);        
        }
        
        leitor.close();
    }
    
}
