package atividades;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a number to see it multiplication table: ");
        int number = sc.nextInt();

        int counter = 0;
        while (counter < 11){
            System.out.printf("%d x %d = %d\n", number, counter, number * counter);
            counter += 1;
        }
    }        
}
