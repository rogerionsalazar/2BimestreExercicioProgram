package org.example;

import java.io.FileNotFoundException;

public class EXEC4_ReajusteTeto {

    public static void main (String[] args){

        /*
        * Aplique 10% de reajuste aos salários de 8 funcionários, com limite
          de R$ 5.000,00. Mostre os salários antes e depois e o aumento
          total da folha.
        * */
        /*
        *   Variavel vetor de salario para armazena os salarios de 8 passageiros,
        *   Variavel aumento, calculo direto para acrecentar%*
            Variavel teto limeite para fixar o limite
            vraiavel reajuste para receber o calculo dos aumentos salariais
        * * */
        double[] salario = new  double[]{4800,1500,5002,2600,3900,3400,4999,5001};
        double aumento = 1.10, tetoLimite = 5000, reajuste;

        for ( int i = 0; i < salario.length ;i++){
            System.out.println("Salario Atual: " + salario[i] );
            reajuste = salario[i] * aumento;
            if (salario[i] < tetoLimite){
                System.out.printf("Aumento %.2f%n", reajuste);
            }else {
            System.out.println("Ajuste não pode ser aplicado para "+salario[i]+" , acima do teto limite para o reajuste");
            }
        }

    }
}
