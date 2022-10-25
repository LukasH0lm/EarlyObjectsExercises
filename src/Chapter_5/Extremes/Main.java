package Chapter_5.Extremes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println(extremes());

    }

    public static int extremes(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many number: ");
        int numberAmmount = scanner.nextInt();
        int currentNumber = 0;

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        while (numberAmmount > 0){
            System.out.print("next number:");
            currentNumber = scanner.nextInt();
            if (currentNumber > highest){
                highest = currentNumber;
            }
            if (currentNumber < lowest){
                lowest = currentNumber;
            }
            numberAmmount--;

        }

        return lowest + highest;
    }

}
