package atividades;

import java.util.Scanner;
import java.util.ArrayList;

public class Progressao_aritmetica {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /* Pega o primeiro número da PA */
        System.out.println("Insert the first term: ");
        int a1 = sc.nextInt();

        /* Pega o número de elemtentos(números) da PA */
        System.out.println("Insert the number of elements: ");
        int n = sc.nextInt();

        /* Pega a razão da PA */
        System.out.println("Insert the reason of the P.A: ");
        int r = sc.nextInt();

        /* Contador */
        int counter = 1;


        /* Verifica se a razão é maior que 0, caso não: ela diz que é uma PA infinita */
        if(r != 0){
            while(counter < n+1){
                System.out.printf(counter + "º Term: %d\n", (a1 + (counter - 1) * r));
                counter++;
            }
        }else{
            System.out.printf("%d, %d, %d... Infinit count!", a1, a1, a1);
        }
    }

}
