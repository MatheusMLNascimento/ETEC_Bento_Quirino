package atividades;

import java.util.Random;
import java.util.Scanner;

public class GPT10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         10 - Declare an array of integers with 8 elements
         and initialize it with random values between 1 and 100.
         Then implement a binary search algorithm to find a specific value in the array.*/

        int[] numbers = new int[8];
        Random gerador = new Random();
        int answer = 0;
        for (int count = 0; count < numbers.length; count++){
            numbers[count] = gerador.nextInt(0,101);
            System.out.println(numbers[count]);
        }
        while(answer != 1) {
            System.out.println("Insert a number to search for the desired value (0-7): ");
            int choice = sc.nextInt();
            System.out.println("Value: " + numbers[choice]);
            System.out.println("Want to do another search?\n1 - No\n2 - Yes\nR: ");
            answer = sc.nextInt();
            if (answer == 1){
                System.out.println("Search done!");
                break;
            }else if(answer == 2){
                System.out.println("Looping...\n");
            }else{
                System.out.println("ERROR: Only 1 and 2 are accepted!");
            }
        }
    }
}