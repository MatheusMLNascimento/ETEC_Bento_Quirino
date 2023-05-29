package atividades;

import java.util.Scanner;

public class laço_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the math operation wanted: \n 1 - Plus\n 2 - Division\n 3 - Multiplication\n 4 - Minus");
        int choice = sc.nextInt();
        System.out.println("Mega Viado");
        if (choice == 1){
            System.out.println("Plus");
            System.out.println("Insert a number: ");
            int a = sc.nextInt();
            System.out.println("Insert another number to plus: ");
            int b = sc.nextInt();
            System.out.printf("Result: %d + %d = %d\n\n", a, b, a + b);
        }
        else if (choice == 2){
            System.out.println("Division");
            System.out.println("Insert a number: ");
            int a = sc.nextInt();
            System.out.println("Insert another number to divide: ");
            int b = sc.nextInt();
            System.out.printf("Result: %d / %d = %d\n\n", a, b, a / b);
        }
        else if (choice == 3){
            System.out.println("Multiplication");
            System.out.println("Insert a number: ");
            int a = sc.nextInt();
            System.out.println("Insert another number to multiply: ");
            int b = sc.nextInt();
            System.out.printf("Result: %d * %d = %d\n\n", a, b, a * b);
        }
        else if (choice == 4){
            System.out.println("Minus");
            System.out.println("Insert a number: ");
            int a = sc.nextInt();
            System.out.println("Insert another number to minus: ");
            int b = sc.nextInt();
            System.out.printf("Result: %d - %d = %d\n\n", a, b, a - b);
        }


    }
}