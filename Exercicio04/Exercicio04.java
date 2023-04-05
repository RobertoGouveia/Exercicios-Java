package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Nome do vendedor: ");
        String nomeVendedor = leitor.nextLine();
        
        System.out.println("Salário do vendedor: ");
        double salarioVendedor = leitor.nextDouble();
        
        System.out.println("Total de vendas do vendedor? ");
        double totalVendas = leitor.nextDouble();
        

        double comissaoVendas = totalVendas*0.15;
        double salarioFinal = salarioVendedor+comissaoVendas;
        
        System.out.println("O nome do vendedor é " + nomeVendedor);
        System.out.println("O salário do vendedor é " + salarioVendedor);
        System.out.println("O total de vendas é " + totalVendas);
        System.out.println("O salário final do vendedor " + nomeVendedor + " é " + salarioFinal);
    }   
}