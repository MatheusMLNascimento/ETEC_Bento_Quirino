package atividades;

import java.util.Random;

public class GPT5 {
    public static void main(String[] args) {

        /**
         5 - Declare an array of integers with 10 elements
         and initialize it with random values between -5 and 5.
         Then count the number of positive, negative, and zero elements in the array.*/

        int[] numbers = new int[10];
        Random generator = new Random();
        int negatives = 0, positives = 0, zeros = 0;
        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = generator.nextInt(-5, 5);
            System.out.println(numbers[count]);
            if (numbers[count] < 0) {
                negatives++;
            } else if (numbers[count] > 0) {
                positives++;
            } else {
                zeros++;
            }
        }
        System.out.printf("The amount of:\nZeros = %d\nPositives = %d\nNegatives = %d", zeros, positives, negatives);
    }
}
