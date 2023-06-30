import java.util.Random;
import java.util.Scanner;

public class CrapGames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int dice1 = random.nextInt(6)+1;
            int dice2 = random.nextInt(6)+1;
            int sum = dice1 + dice2;
            int point = 0;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + dice1 + ", Die 2: " + dice2 + ", Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You crapped out. You lose!");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            } else {
                point = sum;
                System.out.println("Point is now " + point);
                while (true) {
                    System.out.println("Rolling the dice...");
                    dice1 = random.nextInt(6)+1;
                    dice2 = random.nextInt(6)+1;
                    sum = dice1 + dice2;
                    System.out.println("Die 1: " + dice1 + ", Die 2: " + dice2 + ", Sum: " + sum);
                    if (sum == point) {
                        System.out.println("Made point! You win!");break;}
                     else if (sum == 7) {
                        System.out.println("Got a seven! You lose!");break;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }
            }

            System.out.print("Play again? (y/n): ");
            String playAgainInput = in.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("y");
        } while (playAgain);
    }
}
