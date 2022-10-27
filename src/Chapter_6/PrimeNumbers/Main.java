package Chapter_6.PrimeNumbers;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(primeNumbers(10000));

    }

    public static LinkedList<Integer> primeNumbers(int range){


        LinkedList<Integer> listOfPrimes = new LinkedList<>();


        while (range > 1) {
            int denominator = (int) Math.sqrt(range);
            
            while (denominator >= 1) {
                if (denominator == 1) {
                    listOfPrimes.add(range);
                    range -= 1;
                    break;
                }

                if (range % denominator == 0) {
                    range -= 1;
                    break;
                }
                denominator -= 1;
            }
        }
        Collections.reverse(listOfPrimes);
        return listOfPrimes;
    }

}
