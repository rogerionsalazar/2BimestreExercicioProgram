package org.example;

import java.util.Scanner;

public class EXEC3_ConsultaPreco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] codigos = new int[]{22,15,73,19};
        double[] precos = new double[]{15.33,19.25,45.12,99.99};

       int  codigoEscolhido;

        boolean erro =true;

        System.out.println("Informe o Codigo;");
        codigoEscolhido = sc.nextInt();

        for (int i = 0;i < codigos.length; i++){

            if (codigoEscolhido == codigos[i]){
                System.out.println("O Preço" + precos[i]);
                erro = false;
            }

        }
        if(erro){
        System.out.println("Produto Não encontrado");
        }
    }
}
