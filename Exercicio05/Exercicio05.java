package exercicio05;

import java.util.Scanner;

public class Exercicio05 {


    public static void main(String[] args) {
       
        Scanner rt = new Scanner (System.in);
        
        String nomeAluno;
        float nota1, nota2, nota3;
        
        
        System.out.println("Nome do Aluno: ");
        nomeAluno = rt.nextLine();
        
        System.out.println("Nota 1: ");
        nota1 = rt.nextFloat();
        
        System.out.println("Nota 2: ");
        nota2 = rt.nextFloat();
        
        System.out.println("Nota 3; ");
        nota3 = rt.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média final do(a) aluno(a) " + nomeAluno + " é " + media);
    } 
}
