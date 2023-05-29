package atividades;

import java.util.Scanner;

public class tabuada_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = sc.nextInt();
        int contador = sc.nextInt();

        do {
            result = contador * 7;
            System.out.println("7x"+contador+ "="+ result);
            contador++;
        }while (contador<=10);
    }
}
