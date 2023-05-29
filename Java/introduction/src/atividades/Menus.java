package atividades;

import java.util.Scanner;

public class Menus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Option menu\n" +
                "1 - Articles\n" +
                "2 - Browser\n" +
                "3 - Configuration\n" +
                "4 - Diagrams\n" +
                "5 - Enviroment\n" +
                "6 - Exit\n" +
                "Choose a option:");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                String resp = "Y";
                while(true) {
                    System.out.println("\u001b[44m Welcome to Articles Section!");
                    System.out.println("Do you wish return to previous menu? Y or N");
                    resp = sc.next().toUpperCase();
                    if (resp.equals("Y")) {
                        break;
                    }
                }
            case 2:
                System.out.println("\u001b[44mWelcome to Browser Section!");
                System.out.println("\u001b[45mSubmenu");
                System.out.println("\u001b[42m1 - Go to website");
                System.out.println("2 - Go to Google");
                System.out.println("3 - Go to Email");
                System.out.println("4 - Exit");
                System.out.println("\u001b[45mChoice a option:");
                int option = sc.nextInt();
                switch(option){
                    case 1:
                        System.out.println("\u001b[30m \u001b[42m Going to website!");
                        break;
                    case 2:
                        System.out.println("\u001b[30m \u001b[42m Going to Google!");
                        break;
                    case 3:
                        System.out.println("\u001b[30m \u001b[42m Going to Email!");
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("\u001b[44mWelcome to Configuration Section!");
                System.out.println("1 - Customize\n" +
                        "2 - Restart\n" +
                        "3 - Shut Down\n" +
                        "4 - MEME\n" +
                        "5 - Exit\n" +
                        "Choose a option: ");
                int choice2 = sc.nextInt();
                switch (choice2){
                    case 1:
                        System.out.println("Welcome to customize!");
                        System.out.println("█۞███████]▄▄▄▄▄▄▄▄▄▄▃ ●●●\n" +
                                "▂▄▅█████████▅▄▃▂…\n" +
                                "[███████████████████]\n" +
                                "◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙\n" +
                                "There's no customize at war");
                        break;
                    case 2:
                        System.out.println("Restart... \n");
                        System.out.println("Restart failed!\n");
                    case 3:
                        System.out.println("POWERING OFF");
                        System.out.println(".\n" +
                                ".\n" +
                                ".\n");
                        break;
                    case 4:
                        System.out.println("▒▒▒▒▒▒▒▒▒▄▄▄▄▒▒▒▒▒▒▒\n" +
                                "▒▒▒▒▒▒▄▀▀▓▓▓▀█▒▒▒▒▒▒\n" +
                                "▒▒▒▒▄▀▓▓▄██████▄▒▒▒▒\n" +
                                "▒▒▒▄█▄█▀░░▄░▄░█▀▒▒▒▒\n" +
                                "▒▒▄▀░██▄░░▀░▀░▀▄▒▒▒▒\n" +
                                "▒▒▀▄░░▀░▄█▄▄░░▄█▄▒▒▒\n" +
                                "▒▒▒▒▀█▄▄░░▀▀▀█▀▒▒▒▒▒\n" +
                                "▒▒▒▄▀▓▓▓▀██▀▀█▄▀▀▄▒▒\n" +
                                "▒▒█▓▓▄▀▀▀▄█▄▓▓▀█░█▒▒\n" +
                                "▒▒▀▄█░░░░░█▀▀▄▄▀█▒▒▒\n" +
                                "▒▒▒▄▀▀▄▄▄██▄▄█▀▓▓█▒▒\n" +
                                "▒▒█▀▓█████████▓▓▓█▒▒\n" +
                                "▒▒█▓▓██▀▀▀▒▒▒▀▄▄█▀▒▒\n" +
                                "▒▒▒▀▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    default:
                        break;
                }
                break;
            case 4:
                String resp2 = "Y";
                System.out.println("\u001b[44mWelcome to Diagrams Section!");
                System.out.println("\u001B[45mUnder construction. ");
                System.out.println("Do you wish return to previous menu? Y or N");
                resp2 = sc.next();
                System.out.println("\u001B[41mBut U Can't\n" +
                        "░░░░░░░░░░░░░░░░░░░░░░\n" +
                        "░░░░░▄▄░░░░░░▄▄▄▄░░░░░\n" +
                        "░░░▐▀▀▄█▀▀▀▀▀▒▄▒▀▌░░░░\n" +
                        "░░░▐▒█▀▒▒▒▒▒▒▒▒▀█░░░░░\n" +
                        "░░░░█▒▒▒▒▒▒▒▒▒▒▒▀▌░░░░\n" +
                        "░░░░▌▒██▒▒▒▒██▒▒▒▐░░░░\n" +
                        "░░░░▌▒▒▄▒██▒▄▄▒▒▒▐░░░░\n" +
                        "░░░▐▒▒▒▀▄█▀█▄▀▒▒▒▒█▄░░\n" +
                        "░░░▀█▄▒▒▐▐▄▌▌▒▒▄▐▄▐░░░\n" +
                        "░░▄▀▒▒▄▒▒▀▀▀▒▒▒▒▀▒▀▄░░\n" +
                        "░░█▒▀█▀▌▒▒▒▒▒▄▄▄▐▒▒▐░░\n" +
                        "░░░▀▄▄▌▌▒▒▒▒▐▒▒▒▀▒▒▐░░\n" +
                        "░░░░░░░▐▌▒▒▒▒▀▄▄▄▄▄▀░░\n" +
                        "░░░░░░░░▐▄▒▒▒▒▒▒▒▒▐░░░\n" +
                        "░░░░░░░░▌▒▒▒▒▄▄▒▒▒▐░░░");
                break;

            case 5:
                System.out.println("\u001b[44mWelcome to Environment Section!");
                System.out.println("\u001B[42m░░░░░▄▄▄▄▀▀▀▀▀▀▀▀▄▄▄▄▄▄░░░░░░░\n" +
                        "░░░░░█░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░▀▀▄░░░░\n" +
                        "░░░░█░░░▒▒▒▒▒▒░░░░░░░░▒▒▒░░█░░░\n" +
                        "░░░█░░░░░░▄██▀▄▄░░░░░▄▄▄░░░░█░░\n" +
                        "░▄▀▒▄▄▄▒░█▀▀▀▀▄▄█░░░██▄▄█░░░░█░\n" +
                        "█░▒█▒▄░▀▄▄▄▀░░░░░░░░█░░░▒▒▒▒▒░█\n" +
                        "█░▒█░█▀▄▄░░░░░█▀░░░░▀▄░░▄▀▀▀▄▒█\n" +
                        "░█░▀▄░█▄░█▀▄▄░▀░▀▀░▄▄▀░░░░█░░█░\n" +
                        "░░█░░░▀▄▀█▄▄░█▀▀▀▄▄▄▄▀▀█▀██░█░░\n" +
                        "░░░█░░░░██░░▀█▄▄▄█▄▄█▄████░█░░░\n" +
                        "░░░░█░░░░▀▀▄░█░░░█░█▀██████░█░░\n" +
                        "░░░░░▀▄░░░░░▀▀▄▄▄█▄█▄█▄█▄▀░░█░░\n" +
                        "░░░░░░░▀▄▄░▒▒▒▒░░░░░░░░░░▒░░░█░\n" +
                        "░░░░░░░░░░▀▀▄▄░▒▒▒▒▒▒▒▒▒▒░░░░█░\n" +
                        "░░░░░░░░░░░░░░▀▄▄▄▄▄░░░░░░░░█░░\n" +
                        "\u001B[42mU got trolled");
                break;

            default:
                System.exit(0);
        }
    }
}
