package exercises;

import java.util.Scanner;

public class exercises1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Atividade 1 */
        System.out.println("nota do 1° e 2° semestre:");
        float nota1 = sc.nextFloat();
        System.out.println("semestre 2");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2f;
        if (media < 7) {
            System.out.println("Reprovado! nota final: " + media);
        } else {
            System.out.println("Aprovado! nota final: " + media);
        }

        /* Atividade 2 */
        System.out.println("Odd or even\nInsert a number:");
        int numero1 = sc.nextInt();
        if (numero1 % 2 == 1){
            System.out.println("The number is Even!");
        }else{
            System.out.println("The number is Odd!");
        }

        /* Atividade 3 */
        /*create a program that the user insert two number and receive what the biggest number and the smallest number*/

    }
}