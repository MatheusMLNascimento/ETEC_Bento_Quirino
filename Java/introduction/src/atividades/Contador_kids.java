package atividades;

import java.util.Scanner;

public class Contador_kids {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         2) Tentando ensinar uma criança a contar de 1 (um) a 9 (nove),
         uma professora imaginou um programa de computador que quando o aluno fornece um número o computador
         imprime uma sequência de asteriscos ("*") relativos ao número fornecido.

         Exemplos: Aluno fornece o número 2, o programa imprime "
         "Aluno forneceo número 7, o programa imprime "

         Escreva o programa que a professora imaginou e a ajude a ensinar seus alunos!
         */
        System.out.println("Insira um número qualquer e verifique seu tamanho em astericos '*'");
        int numeros = sc.nextInt();
        for (int count = 0; count < numeros; count++){
            System.out.println("*");
        }
    }
}
