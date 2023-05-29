package atividades;

import java.util.Scanner;

public class Logic_tests {

    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = 6;
        int B = 25;

        /* 1 - (A > B) && (B < A) */
        if ((A < B) && (B < A)){
            System.out.println("1 - True");
        }else{
            System.out.println("1 - False");
        }
        System.out.println("\n\n");

        /* 2 - (A != B) || (A == B) */
        if ((A != B) || ( A == B)){
            System.out.println("2 - True");
        }else{
            System.out.println("2 - False");
        }
        System.out.println("\n\n");

        /* 3 - (A <= B) && (B >= A) || !(B != A) */
        if ((A <= B) && (B >= A) || !(B != A)){
            System.out.println("3 - True");
        }else{
            System.out.println("3 - False");
        }
        System.out.println("\n\n");

        /* False = 0 & True = 1 */
        /* 4 - (B == A) || (A != B) < (B > A) == (!A == B) */
        /*if ((B == A) || (A != B) < (B > A) == (!A == !B)){
            System.out.println("4 - True");
        }else{
            System.out.println("4 - False");
        }
        System.out.println("\n\n");

        /* 5 - (A != B) && !(B > A) >= (B != A) >! (A == B) */
        /*if ((A != B) && !(B > A) >= (B != A) >! (A == B)){
            System.out.println("5 - True");
        }else{
            System.out.println("5 - False");
        }
        System.out.println("\n\n");*/
    }

}
