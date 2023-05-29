package atividades;

import java.util.Scanner;

public class Progressao_geometrica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        /* Pega o primeiro número da PG */
        System.out.println("Insert the first term: ");
        int a1 = sc.nextInt();

        /* Pega a posição do número desejada */
        System.out.println("Insert the number position desired: ");
        int n = sc.nextInt();

        /* Pega a razão da PG */
        System.out.println("Insert the reason: ");
        int r = sc.nextInt();


        /* an = a1 * q**(n-1) */
        int result = a1 * r^(n-1);
        System.out.printf("a%d = %d * %d^(%d-1)\n", n, a1, r, n);
        System.out.printf("a%d = %d", n, result);
    }
}
