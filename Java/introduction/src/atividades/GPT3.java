package atividades;

import java.util.Scanner;

public class GPT3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * 3 - Declare an array of strings with 3 elements
         and initialize it with your favorite colors.
         Then loop through the array and print out each element.*/

        System.out.println("Insira as suas 3 cores favoritas: ");
        String[] colors = new String[3];
        for (int count = 0; count < colors.length; count++){
            String favorite_colors = sc.next();
            colors[count] = favorite_colors;
        }
        System.out.printf("Suas cores favoritas são: %s, %s e %s. Você tem bom gosto!", colors[0], colors[1], colors[2]);

    }
}
