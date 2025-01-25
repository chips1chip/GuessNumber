
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(101); 
        Scanner sc = new Scanner(System.in);
        Integer Guess = null;

        System.out.println("Welcome to Guess The Number Game!");
        System.out.println("I have selected a number between 0 and 100. Try to guess it!");

        while (!Objects.equals(Guess, randomNumber)) {
            System.out.print("Enter your guess: ");
            if (sc.hasNextInt()) {
                Guess = sc.nextInt();

                if (Objects.equals(Guess, randomNumber)) {
                    System.out.println("Yay!You guessed right!");
                }
                else {
                    if (Guess > randomNumber) {
                        System.out.println("Too high! Guess a number lower");
                    }
                    else {
                        System.out.println("Too low! Guess a number higher");
                    }
                }
            }
        }
    }
}