package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double custoFabrica, precoFinal, resultado, precoVeiculo, CustoFabricaComImpostos;
        double impostos = 0.45;
        double percentualDistribuidor = 0.28;
        
        System.out.println("Qual o custo da fábrica? ");
        custoFabrica = sc.nextDouble();
        
        resultado = custoFabrica * impostos;
        CustoFabricaComImpostos = resultado + custoFabrica;
        
        precoFinal = CustoFabricaComImpostos * percentualDistribuidor;
        precoVeiculo = precoFinal + CustoFabricaComImpostos;        
                
        
        System.out.println("O preço do veículo é: " + precoVeiculo);
        
        
        sc.close();
    }
}
