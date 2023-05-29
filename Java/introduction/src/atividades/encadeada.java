package atividades;

import java.util.Scanner;

public class encadeada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the student:");
        double average = sc.nextDouble();

        if (average < 5){
            System.out.println("\033[0;32m Failed student!");
        }else if(average>7){
            System.out.println("\033[0;33m Summer school!");
        }else{
            System.out.println("\033[0;34m Approved!");
        }

    }

}
