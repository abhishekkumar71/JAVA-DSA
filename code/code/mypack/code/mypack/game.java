package code.mypack;

import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        System.out.println("Enter your choice:(rock,paper,scissors)");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        Random ran = new Random();
        int rand = ran.nextInt(3);
        System.out.println(rand);
        String mychoice = "";
        switch (rand) {
            case 0:
                mychoice = "rock";
                break;
            case 1:
                mychoice = "paper";
                break;
            case 2:
                mychoice = "scissors";
                break;
            default:
                System.out.println("invalid");
                break;
        }

        if (choice.equals("paper") && mychoice.equals("rock")) {
            System.out.println("You won!!!");
        } else if (choice.equals("paper") && mychoice.equals("scissors")) {
            System.out.println("You lost");
        } else if (choice.equals("rock") && mychoice.equals("paper")) {
            System.out.println("You lost");
        } else if (choice.equals("rock") && mychoice.equals("scissors")) {
            System.out.println("You won!!!");
        } else if (choice.equals("scissors") && mychoice.equals("rock")) {
            System.out.println("You lost");
        } else if (choice.equals("scissors") && mychoice.equals("paper")) {
            System.out.println("You won!!!");
        } else if (mychoice.equals(choice)) {
            System.out.println("Match drawn!!!");
        }
        System.out.println("i've choosen:" + mychoice);

    }
}
