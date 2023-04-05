package exercicio21;

import java.util.Scanner;

public class Exercicio21 {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        String nome, saude;
        char sexo;
        int idade, aptos = 0, naoAptos = 0, n;
        
        System.out.println("Quantos candidatos deseja cadastrar? ");
        n = leitor.nextInt();
        
        for (int i = 1; i <= n; i++){
                
            System.out.println("Nome do Candidato " + i + ":");
            nome = leitor.next();
        
            System.out.println("Sexo do Candidato" + " (M/F): " );
            sexo = leitor.next().charAt(0);
        
            System.out.println("Idade do Candidato " + i + ":");
            idade = leitor.nextInt();
        
            System.out.println("Saúde do Candidato" + " (boa/ruim): ");
            saude = leitor.next();
            
            
            if (sexo == 'M' && idade >= 18 && saude.equals("boa")) {
                System.out.println("O candidato " + nome + " está apto.");
                aptos++;
            }else{
                System.out.println("O candidato " + nome + " está inapto.");
                naoAptos++;
            }
        
            System.out.println("O total de canditatos aptos é: " + aptos);
            System.out.println("O total de candidatos inaptos é: " + naoAptos);
        }
    }        
}