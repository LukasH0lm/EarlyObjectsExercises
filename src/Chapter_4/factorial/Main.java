package Chapter_4.factorial;

public class Main {

    public static void main(String[] args) {
        System.out.println("!10 = " + factorial(10));
        System.out.println("e = " + estimateE(3.0));
        System.out.println("e^2 = " + estimateE(3.0, 2));
    }

    static public double factorial(double number){
        double res= 1;
        while(number > 0){
            res = res * number;
            number--;
        }
        return res;
    }

    static public double estimateE(double number){
        double res = 1;
        while(number > 0){
            res = res + 1 / factorial(number);
            number--;
        }
        return res;
    }


    static public double estimateE(double number, double numerator){
        double exponent = 1;
        double res = 1;
        while(number > 0){
            res = res + (Math.pow(numerator, exponent)) / factorial(exponent);
            number--;
            exponent++;
        }
        return res;
    }


    }



