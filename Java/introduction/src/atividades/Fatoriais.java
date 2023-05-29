package atividades;

import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         4) O fatorial de um número inteiro positivo é o produto dele por todos os seus
        antecessores até 1, representa-se N!. Por definição o fatorial de 0! = 1 e o fatorial de 1! = 1!.
        Exemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120.
        Faça um programa que peça um número ao usuário e imprima o fatorial deste número na tela. */
        System.out.println("Insira um número para ver seu fatorial: ");
        int numeros = sc.nextInt();
        System.out.printf("%d!\n", numeros);
        int mult = numeros;
        int contador = 0;
        for (int count = 0; count < numeros-1; count++){
            contador = numeros-count;
            System.out.println(contador + "*");
            mult *= contador-1;
        }
        System.out.println("1*\n");
        System.out.println(numeros + "! = " + mult);
    }
}
