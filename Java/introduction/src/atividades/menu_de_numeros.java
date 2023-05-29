package atividades;

import java.util.Scanner;

public class menu_de_numeros {
    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! ");
        System.out.println("Option menu:");
        System.out.println("1 - Articles\n2 - \n3 - Config\n4 - File Explorer\n5 - Word\n6 - Exit");
        System.out.println("Choose one");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Going to website");
                break;
            case 2:
                System.out.println("opition menu");
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println();
                break;
            case 5:
                System.out.println();
                break;
            case 6:
                System.out.println();
                break;
            default:
                System.out.println("Sinto muito essa opção não está inclusa!");
        }





    }
}