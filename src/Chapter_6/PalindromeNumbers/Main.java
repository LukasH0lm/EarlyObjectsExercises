package Chapter_6.PalindromeNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("input: ");
            String number = scanner.next();
            System.out.println(number +" is a palindrome? " + PalindromeNumbers(number) + "\n");
        }
    }

    public static boolean PalindromeNumbers(String input){

        //checks if the String is empty or a single character, and therefore is a palindrome
        if (input.equals("") || input.length() == 1){
            return true;
        }

        int firstDigit = input.charAt(0);
        int lastDigit = input.charAt(input.length() -1);

        if (!(firstDigit == lastDigit)) {
            return false;
        }

        StringBuilder nextNumber = new StringBuilder(input);

        nextNumber.deleteCharAt(0);
        nextNumber.deleteCharAt(nextNumber.length() - 1);

        return PalindromeNumbers(nextNumber.toString());

        }

    }

