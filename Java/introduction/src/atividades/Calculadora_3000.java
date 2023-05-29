package atividades;

import java.util.Scanner;

public class Calculadora_3000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the math operation wanted: \n 1 - Plus\n 2 - Division\n 3 - Multiplication\n 4 - Minus");
        int choice = sc.nextInt();
        System.out.println("Insert the first number");
        int a = sc.nextInt();
        System.out.println("Insert the second number");
        int b = sc.nextInt();
        switch(choice){
            case 1:
                System.out.printf("Plus\n%d + %d = %d", a, b, a + b);
                break;

            case 2:
                System.out.printf("Division\n%d / %d = %d", a, b, a / b);
                break;

            case 3:
                System.out.printf("Multiplication\n%d X %d = %d", a, b, a * b);
                break;

            case 4:
                System.out.printf("Minus\n%d - %d = %d", a, b, a - b);
                break;
        }


    }
}