package Chapter_6.PalindromeNumbers;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-".repeat(103));
        System.out.println("    Lukash0lm's palindrome checker, enter a string to check if it's a palindrome, or \"exit\" to exit");
        System.out.println("-".repeat(103));

        while (true) {
            System.out.print("input: ");
            String input = scanner.next();
            if (Objects.equals(input, "exit")){ break; }
            System.out.println(input +" is a palindrome? " + PalindromeChecker(input) + "\n");
        }
    }

    public static boolean PalindromeChecker(String input){

        //checks if the String is empty or a single character, and therefore is a palindrome
        if (input.equals("") || input.length() == 1){
            return true;
        }

        int firstDigit = input.charAt(0);
        int lastDigit = input.charAt(input.length() -1);

        if (!(firstDigit == lastDigit)) {
            return false;
        }

        StringBuilder nextInput = new StringBuilder(input);

        nextInput.deleteCharAt(0);
        nextInput.deleteCharAt(nextInput.length() - 1);

        return PalindromeChecker(nextInput.toString());

        }

    }

