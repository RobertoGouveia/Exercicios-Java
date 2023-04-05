package exercicio17;

import java.util.Scanner;

public class Exercicio17 {


    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);
        
        int contador = 0;
        int numero;
        
        for (int i = 0; i <80; i++) {
            System.out.println("Digite o " + (i+1) + "º número: ");
            numero = leitor.nextInt();
            if (numero >= 10 && numero <= 150){
                contador++;
            }
        }
        System.out.println("Existem " + contador + " número (s) entre 10 e 150. ");
    }
    
}
