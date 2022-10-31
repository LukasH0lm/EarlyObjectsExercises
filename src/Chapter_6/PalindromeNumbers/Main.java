package Chapter_6.PalindromeNumbers;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        controller();
    }

    public static void controller(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-".repeat(103));
        System.out.println("    Lukash0lm's palindrome checker, enter a string to check if it's a palindrome, or \"exit\" to exit");
        System.out.println("-".repeat(103));

        while (true) {
            System.out.print("input: ");
            String input = scanner.nextLine().trim();
            if (Objects.equals(input, "exit")){ break; }
            System.out.println(input +" is a palindrome? " + PalindromeChecker(input) + "\n");
        }
    }

    public static boolean PalindromeChecker(String input){

        //checks if the String is empty or a single character, and therefore is a palindrome
        if (input.length() <= 1){
            return true;
        }

        if (!(input.charAt(0) == input.charAt(input.length() -1))) {
            return false;
        }

        return PalindromeChecker(input.substring(1,input.length() - 1));

        }

    }

