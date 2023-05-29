package atividades;

import java.util.Arrays;
import java.util.Random;

public class GPT7 {
    public static void main(String[] args) {
        /**
         7 - Declare an array of integers with 15 elements
         and initialize it with random values between 1 and 100.
         Then find the second-largest value in the array.*/

        int[] numbers = new int[15];
        Random generator = new Random();
        for (int count = 0; count < numbers.length; count++){
            numbers[count] = generator.nextInt(1, 101);
            System.out.println(numbers[count]);
        }
        Arrays.sort(numbers);
        System.out.println("\nThe second largest value in the array is: " + numbers[13]);
    }
}
