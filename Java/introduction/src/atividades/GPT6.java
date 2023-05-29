package atividades;

import java.util.Arrays;
import java.util.Scanner;

public class GPT6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /**
         6 - Declare an array of strings with 5 elements
         and initialize it with random words.
         Then sort the array in alphabetical order.*/
        String[] words = new String[5];
        System.out.println("Insira 5 palavras aleatórias: ");
        for (int count = 0; count < words.length; count++){
            words[count] = sc.nextLine();
        }
        Arrays.sort(words);
        System.out.println("\nOrganizando em ordem alfabética...\n");
        for (int count = 0; count < words.length; count++){
            System.out.println(words[count]);
        }
    }
}
