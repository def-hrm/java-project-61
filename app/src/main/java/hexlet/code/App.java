package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter." +
                "\n1 - Greet" +
                "\n2 - Even" +
                "\n3 - Calc" +
                "\n4 - GCD" +
                "\n5 - Progression" +
                "\n6 - Prime" +
                "\n0 - Exit");
        Scanner objA = new Scanner(System.in);
        int choise = objA.nextInt();
        if(choise >= 1 && choise <= 9) {
            System.out.println("Your choice: " + choise);
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
        } else if(choise == 0) {
            System.out.println("Are you sure? Please answer 'yes' or 'no' ");
            Scanner objC = new Scanner(System.in);
            String exit = objC.nextLine();
            if (exit.equals("yes")) {
                System.out.println("See you next time!");
            }
            if (exit.equals("no")) {
                System.out.println("Please enter the game number and press Enter.");
            }
        } else {
            System.out.println("Error! Please enter the number from 1 to 9");
        }
        if(choise == 1) {
            Scanner objB = new Scanner(System.in);
            String name = objB.nextLine();
            System.out.println("Hello, " + name + "!");
        }
        if(choise == 2) {
            Even.even();
        }
    }
}
