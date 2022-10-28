package Chapter_6.squareOfAsterisks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        controller();

    }

    public static void controller(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the String to be repeated: ");
        String symbol = scanner.next();

        System.out.print("Input the length of the Sides: ");
        int side = scanner.nextInt();

        squareOfAsterisks(symbol, side);
    }

    public static void squareOfAsterisks(String symbol, int side){
        for (int i = 1; i <= side; i++){
            System.out.println(symbol.repeat(side));
        }

    }

}
