package atividades;

import java.util.Random;

public class GPT8 {
    public static void main(String[] args) {
        /**
         8 - Declare an array of doubles with 20 elements
         and initialize it with random values between -10 and 10.
         Then compute the sum of all the even elements in the array.*/
        double[] numbers = new double[20];
        double soma = 0;
        int evens = 0;
        Random gerador = new Random();
        for (int count = 0; count < numbers.length; count++){
            numbers[count] = gerador.nextDouble(-11,11);
            System.out.println(numbers[count]);
            if (numbers[count] % 2 == 1){
                soma += numbers[count];
                evens++;
                System.out.println("Soma impar: " + soma);
            }
        }
        System.out.printf("Média final: %f", (soma / evens));
    }
}
