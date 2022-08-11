import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        int secretNumber = 5;
        // This is the target number for my game

        System.out.println("Please choose a number to play!");

        // A prompt to encourage the players

        Scanner reader = new Scanner(System.in);
        String chosenNumber = reader.nextLine();
        // This allows players to input numbers to play the game

        if (chosenNumber > secretNumber) {
            System.out.println("Too big!");
        }

        // i want to say lower if they guess too high

        if (chosenNumber < secretNumber) {
            System.out.println("Too small!");
        }

        // i want to say higher if they guess too low

        if (chosenNumber = secretNumber) {
            System.out.println("Congratulations, you are correct!");
        }

        // i want to say "Congratulations, you are correct!"
        // if they guess correctly (5)

    }
}
