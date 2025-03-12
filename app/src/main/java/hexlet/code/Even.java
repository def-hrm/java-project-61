package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        Scanner objB = new Scanner(System.in);
        String name = objB.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int countRight = 0;
        while (countRight <= 2) {
            String correctAnswer = "";
            Random random = new Random();
            int randomNumberEven = random.nextInt(1000000);
            System.out.println("Question: " + randomNumberEven);
            int restEven = randomNumberEven % 2;
            if(restEven == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            Scanner objEven = new Scanner(System.in);
            String playerAnswer = objEven.nextLine();
            System.out.println("Your answer: " + playerAnswer);
            if ((playerAnswer.equals("yes") && correctAnswer.equals("no"))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            if ((playerAnswer.equals("no") && correctAnswer.equals("yes"))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            //if ((!playerAnswer.equals("no") || !playerAnswer.equals("yes"))) {
                //System.out.println("Wrong! Answer 'yes' if the number is even, otherwise answer 'no'.");
                //System.out.println("Let's try again, " + name + "!");
                //break;
            //}
            if ((playerAnswer.equals("yes") && correctAnswer.equals("yes")) || (playerAnswer.equals("no") && correctAnswer.equals("no"))) {
                System.out.println("Correct!");
                countRight += 1;
            }
        }
        if (countRight == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
