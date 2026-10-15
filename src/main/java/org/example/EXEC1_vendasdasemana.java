package org.example;

import java.util.Scanner;

public class EXEC1_vendasdasemana {

    public static void main(String[] args){
        /*
        Leia o faturamento dos 7 dias da semana. Mostre o total, a média
        diária e o dia que mais vendeu.
         */
        Scanner sc = new Scanner(System.in);
        String[] semana= {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};
        double[] setdias = new double[7];
        double total = 0;
        double maiorvenda = 0;
        int diademaiorvenda = 0;


        for (int i = 0; i < setdias.length; i++){
//            System.out.println(i);
            setdias[i] = i+1;
            System.out.println("Digite o Faturamento da "+ semana[i]);
            setdias[i] = sc.nextDouble();

            if(setdias[i] > maiorvenda){
                maiorvenda = setdias[i];
                diademaiorvenda = i;
            }
             total += setdias[i];

        }

        System.out.println("Faturamento Total: " );
        System.out.println("Faturamento Total: " );
        System.out.println("Faturamento Total: " );

    }

}
