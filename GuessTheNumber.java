import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(101); 
        Scanner sc = new Scanner(System.in);
        int Guess = 0;
        int tries = 5;

        System.out.println("""
        -------------------------------------
        Welcome to Guess The Number Game!
        -------------------------------------""");  //greetings
        System.out.println("I have selected a number between 0 and 100. Try to guess it!");

        while ((Guess != randomNumber) && (tries > 0)) {  // looping while number not guessed

            System.out.print("Enter your guess: ");   //taking guess from user
            if (sc.hasNextInt()) {
                Guess = sc.nextInt();

                if (Guess == randomNumber) {   // if guess is right
                    System.out.println("Yay!You guessed right!");
                }
                else {               // if guess is wrong
                    if (Guess > randomNumber) {
                        System.out.println("Too high! Guess a number lower");    //hint
                    }
                    else {
                        System.out.println("Too low! Guess a number higher");    //hint
                tries = tries-1;
                    }

                if (tries == 0) {    //to check no of tries
                    System.out.println("Max tries reached!");  // if no tries left then game ends
                    System.out.println("GAME OVER!");
                }
                else {
                    if (tries != 0) {          // if tries left
                        System.out.println("tries left : " + tries);   // displays number of tries
                    }

                }
                }
            }
        }
    }
}
