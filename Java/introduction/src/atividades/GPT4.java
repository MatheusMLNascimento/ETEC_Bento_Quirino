package atividades;

import java.util.Arrays;
import java.util.Random;

public class GPT4 {
    public static void main(String[] args) {
        /**
         4 - Declare an array of integers with 7 elements
         and initialize it with random values between 1 and 10.
         Then find the maximum value in the array.*/

        int[] numbers = new int[7];
        Random generator = new Random();
        for (int count = 0; count < numbers.length; count++){
            numbers[count] = generator.nextInt(1, 11);
            System.out.println(numbers[count]);
        }
        Arrays.sort(numbers);
        System.out.println("\nThe maximum value in the array is: " + numbers[6]);
    }
}
