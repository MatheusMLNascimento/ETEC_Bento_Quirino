package atividades;

import java.util.Scanner;

public class Media_idade_peso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     /**
      5) Escreva um programa que leia a idade e o peso dos jogadores de um time de basquete.
      No final imprima a média de idade e a média de peso deste time.*/

        System.out.println("Insert the number of players in the team: ");
        int total_players = sc.nextInt();
        /*int[] numbers = new int[total_players];*/
        float[] weight = new float[total_players];
        int[] age = new int[total_players];
        float sum1 = 0;
        int sum2 = 0;
        for (int count = 0; count < total_players; count++){
            System.out.println("\nPeso do jogador " + (count+1) + ":");
            weight[count] = sc.nextFloat();
            System.out.println("Idade do jogador " + (count+1) + ":");
            age[count] = sc.nextInt();
            sum1 += weight[count];
            sum2 += age[count];
            System.out.println("Peso: Kg \n" + weight[count]);
            System.out.println("Idade: \n" + age[count]);
        }
        System.out.println("The average of weight is: Kg " + (sum1/total_players));
        System.out.println("The average of age is: " + (sum2/total_players));
    }
}
