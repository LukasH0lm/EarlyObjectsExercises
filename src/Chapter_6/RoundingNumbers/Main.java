package Chapter_6.RoundingNumbers;

public class Main {
    public static void main(String[] args) {
        roundingNumber(2.5);
        roundingNumber(-5.8);
        roundingNumber(22.3);
        roundingNumber(-94.4567);

    }

    public static void roundingNumber(double number){
        double roundedNumber = Math.floor(number);
        System.out.println("\nOriginal Number: " + number);
        System.out.println("Rounded Number: " + roundedNumber);

    }

}
