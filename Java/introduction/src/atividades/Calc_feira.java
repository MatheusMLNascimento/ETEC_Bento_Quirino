package atividades;

import java.util.Scanner;

public class Calc_feira {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         1) Para ir à feira, uma dona de casa relacionou 10 produtos a serem comprados.
         Elabore um programa que solicite o valor de cada produto e no final exiba o valor total da compra para a dona de casa.
        */
        System.out.println("Insira o valor dos 10 produtos para ter o valor total: ");
        float soma = 0;
        for (int count = 0; count < 10; count++){
            float valores = sc.nextFloat();
            soma += valores;
        }
        System.out.printf("O total das compras ficou: R$ %.2f", soma);

         /**
         2) Tentando ensinar uma criança a contar de 1 (um) a 9 (nove),
         uma professora imaginou um programa de computador que quando o aluno fornece um número o computador
         imprime uma sequência de asteriscos ("*") relativos ao número fornecido.

         Exemplos: Aluno fornece o número 2, o programa imprime "
         "Aluno forneceo número 7, o programa imprime "

         Escreva o programa que a professora imaginou e a ajude a ensinar seus alunos!

         3) A tabuada de um determinado número é uma tabela de produtos deste número com os números de 1 a 9.
         Escreva um programa que peça um número ao usuário e imprima a tabuada deste número na tela.

         4) O fatorial de um número inteiro positivo é o produto dele por todos os seus
         antecessores até 1, representa-se N!. Por definição o fatorial de 0! = 1 e o fatorial de 1! = 1!.
         Exemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120.
         Faça um programa que peça um número ao usuário e imprima o fatorial deste número na tela.

         5) Escreva um programa que leia a idade e o peso dos jogadores de um time de basquete.
         No final imprima a média de idade e a média de peso deste time.*/
    }
}
