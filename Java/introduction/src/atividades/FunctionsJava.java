package atividades;

import java.util.Scanner;

public class FunctionsJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insirt a number");
        int n1 = sc.nextInt();
        System.out.println("Insirt Another number");
        int n2 = sc.nextInt();
        System.out.println("Insert a Math sign");
        String sign = sc.next();
        switch (sign){
            case"+":
                System.out.println("O resultado da soma é "+sumEtec(n1,n2));
                break;
            case "-":
                System.out.println("O resultasdo da subtração é "+SubEtec(n1,n2));
                break;
            case "*":
                System.out.println("O resultado da multiplicação é "+MultEtec(n1,n2));
                break;
            case "/":
                System.out.println("O resultado da divisão é "+DivEtec(n1,n2));
                break;
        }
    }

    public static int sumEtec(int n1, int n2){
        return n1 + n2;
    }
    public static int SubEtec(int n1, int n2){
        return n1 - n2;
    }
    public static int MultEtec(int n1, int n2){
        return n1 * n2;
    }
    public static float DivEtec(int n1, int n2){
        if (n2 != 0) {
            return (float) n1 / n2;
        }else{
            return -1;
        }
    }
}
