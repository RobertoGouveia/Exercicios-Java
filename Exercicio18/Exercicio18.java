package exercicio18;

import java.util.Scanner;

public class Exercicio18 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int idade;
        
        
        for (int i = 1; i < 75; i++){
            System.out.println("Digite a idade da " + i + "º pessoa.");
            idade = sc.nextInt();
            
            if (idade >= 18) {
                System.out.println("Maior de idade");
            }else {
                System.out.println("Menor de idade");
            }
        
        }


    }
    
}
