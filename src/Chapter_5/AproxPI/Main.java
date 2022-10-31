package Chapter_5.AproxPI;

public class Main {

    public static void main(String[] args){
        System.out.println(aproxPI(2000000000));
        System.out.println(Math.PI);
        System.exit(0);

    }

    public static double aproxPI(long iterations){
        double res = 4;
        double divider = 3;
        while (iterations > 0){

            res = res + (4 / divider);
            divider += 2;

            res = res - (4 / divider);
            divider += 2;

            iterations--;

        }

        return res;
    }

}
