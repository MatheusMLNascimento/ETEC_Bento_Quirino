package Exercises.introduction.src.atividades;

import java.util.Random;
import java.util.Scanner;

public class GPT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n");
        double[] numbers = new double[10];
        Random aleatorio = new Random();
        double sum = 0;
        for (int x = 0; x < numbers.length; x++){
            numbers[x] = aleatorio.nextDouble();
            sum += numbers[x];
            System.out.println(numbers[x]);
        }
        System.out.println("The average is: " + (sum/numbers.length));
    }
}
