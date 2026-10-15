package org.example;

public class EXEC2_EstoqueCritico {

    public static void main(String[] args){

        /*
        *Leia o estoque de 10 produtos. Mostre quantos têm menos de 5
         unidades e suas posições.
         */

        String[] produto= {"FONE","HEADFONE","BONECO","FACA","IOIO","LANTERNA","ANZOL","CHUNBADA","LINHA","GAITA"};
        int[] quantidade = {1,2,3,4,5,6,3,8,2,10};
        int menorQuecinco = 5, totalMenor = 0;
        int posicao = 0;
        for (int i= 0; i < quantidade.length;i++) {
            quantidade[i] = i+1;
            System.out.println(produto[i] +" Quantidade: "+quantidade[i]);

            if (quantidade[i] < menorQuecinco){
                   totalMenor = +1;
            }

        }
        System.out.println("Esse é o menor " + totalMenor + " E sua posição é"+ posicao );


    }

}
