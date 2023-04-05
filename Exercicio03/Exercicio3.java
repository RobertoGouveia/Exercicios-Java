package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {

        float totalCombustivel, distanciaTotal;
        float mediaConsumo = 0.0f;

        Scanner r = new Scanner(System.in);
        
        System.out.println("Qual a distancia percorrida? ");
        distanciaTotal = r.nextFloat();
        
        System.out.println("Qual o total de combustivel no tanque? ");
        totalCombustivel = r.nextFloat();
        
        mediaConsumo = distanciaTotal / totalCombustivel;
        
        System.out.println("A media de consumo foi igual a " + mediaConsumo + " Km por litro");
    }
}
