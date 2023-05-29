package atividades;

import java.util.Random;

public class GPT9 {
    public static void main(String[] args) {
        /**
         9 - Declare an array of integers with 12 elements
         and initialize it with random values between 1 and 30.
         Then find the average value of the elements at even indexes (i.e. 0, 2, 4, 6, 8, 10).*/

        int[] numbers = new int[12];
        Random generator = new Random();
        int soma = 0;
        for (int count = 0; count < numbers.length; count++){
            numbers[count] = generator.nextInt(0, 31);
            System.out.println(numbers[count]);
            if (count % 2 == 0){
                soma += numbers[count];
                System.out.println("Soma: " + soma + "\n");
            }else{
                System.out.println("Nâo é par!\n");
            }
        }
        System.out.printf("Média final: %d", (soma / 6));
    }
}