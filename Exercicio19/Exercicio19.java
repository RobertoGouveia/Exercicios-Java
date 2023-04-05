package exercicio19;

import java.util.Scanner;

public class Exercicio19 {

 
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        String nome;
        char sexo;
        int totalHomens = 0;
        int totalMulheres = 0;
        
        for (int i = 1; i <=56; i++ ){
            System.out.println("Informe o nome da pessoa " + i + " : ");
            nome = leitor.nextLine();
            
            System.out.println("Informe o sexo da pessoa " + i + " (M/F): ");
            sexo = leitor.nextLine().charAt(0);
            
            if (sexo == 'M' || sexo == 'm') {
                System.out.println("%s é homem. \n" + nome);
                totalHomens++;
                                
            }else if(sexo=='F' || sexo=='f'){
                System.out.println("%s é mulher.\n" + nome);
                totalMulheres++;
            }else{
                System.out.println("Sexo inválido. Digite M ou F");
                i--;
            }
        }

        System.out.println("O total de Homens é: " +totalHomens);
        System.out.println("O total de mulheres é: " +totalMulheres);
    }
    
}
