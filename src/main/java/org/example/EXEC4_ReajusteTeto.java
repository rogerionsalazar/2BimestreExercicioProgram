package org.example;

import java.io.FileNotFoundException;

public class EXEC4_ReajusteTeto {

    public static void main (String[] args){


        double[] salario = new  double[]{5,7,8,9,3,3,4,6};
        double aumento = 0.10;
        int i;
        for ( i = 0; i < salario.length;i++){

            System.out.println(salario[i]);
            salario[i] = (salario[i] * aumento) * 100;
            System.out.println("Aumento "+ salario[i]);
        }

    }
}
