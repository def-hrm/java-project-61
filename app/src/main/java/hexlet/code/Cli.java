package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void userName() {
        Scanner obj = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = obj.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
