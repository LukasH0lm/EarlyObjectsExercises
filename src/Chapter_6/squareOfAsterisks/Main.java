package Chapter_6.squareOfAsterisks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        squareOfAsterisks();

    }

    public static void squareOfAsterisks(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the String to be repeated: ");
        String symbol = scanner.next();

        System.out.print("Input the length of the Sides: ");
        int side = scanner.nextInt();


        for (int i = 1; i <= side; i++){
            System.out.println(symbol.repeat(side));
        }

    }

}
