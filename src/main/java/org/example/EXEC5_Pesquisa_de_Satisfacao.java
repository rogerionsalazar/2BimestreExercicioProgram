package org.example;

public class EXEC5_Pesquisa_de_Satisfacao {

    public static void main(String[] args){

        /*
        *
        * 10 clientes deram nota de 0 a 10. Mostre quantas vezes cada nota
         apareceu e a mais votada.
         *
         * varivel array Nota1
         *
        * */

        int[] notaClientes = new int[]{1,2,3,4,5,6,7,8,9,10 }, nota;

        for (int i = 0; i < notaClientes.length; i++){

            System.out.println("Nota votada: " + notaClientes[i]);

        }

    }

}
