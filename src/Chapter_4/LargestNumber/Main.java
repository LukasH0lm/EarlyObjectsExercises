package Chapter_4.LargestNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println(findLargestNumber());
    }

    public static int findLargestNumber(){

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int largest = Integer.MIN_VALUE;

        for(int i= 0;i<10;i++){
            System.out.print("next int: ");
            number = scanner.nextInt();
            if(number > largest){
                largest = number;
            }


        }



        return largest;

    }

}
