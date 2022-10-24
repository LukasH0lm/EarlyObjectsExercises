package factorial;

public class Main {

    public static void main(String[] args) {
        System.out.println(estimateE(3.0, 2));
    }

    static public double factorial(double number){
        double res= 1;
        while(number > 0){
            res = res * number;
            number--;
        }
        return res;
    }

    static public double estimateE(double inputnumber){
        double number = (double) inputnumber;
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



