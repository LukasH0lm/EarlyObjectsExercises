package Chapter_6.GuessTheNumber;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        guessTheNumber();
    }

    public static void guessTheNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("LUKASH0LM'S NUMBER GUESSING GAME");
        System.out.println("--------------------------------");

        while (true){
            int guess = 0;
            String choice = "";
            int secretNumber = ThreadLocalRandom.current().nextInt(1,1000 + 1);
            System.out.println("a random number between 1 and 1000 has been generated, try to guess it");
            while (true) {
                System.out.print("take a guess: ");
                guess = scanner.nextInt();
                if (guess > secretNumber){
                    System.out.println("too high");
                }else if (guess < secretNumber){
                    System.out.println("too low");
                }else {
                    //the number is neither too high nor too low, therefore the player has won
                    break;
                }
            }
            System.out.print("Congratulation, do you want to play again (Y/N): ");
            choice = scanner.next();
            System.out.println(choice);
            if (choice.toLowerCase().equals("n")){
                break;
            }

        }
    }
}
