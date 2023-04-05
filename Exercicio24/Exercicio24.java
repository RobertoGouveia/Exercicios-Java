package exercicio24;

import java.util.Scanner;

public class Exercicio24 {

 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n, numero;
        
        System.out.println("Quantos números deseja analisar?");
        n=leitor.nextInt();
        
        for(int i = 1; i<=n; i++){
            System.out.println("Digite o " + i + "º número: ");
            numero=leitor.nextInt();
        
            if(numero>0){
                System.out.println("O " + i + "º é positivo");
            }else if(numero<0){
                System.out.println("O " + i + "º é negativo");
            }else{
                System.out.println("O " + i + "º é zero");
            }
        }
    }
}
