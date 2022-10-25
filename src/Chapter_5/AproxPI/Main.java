package Chapter_5.AproxPI;

public class Main {

    public static void main(String[] args){
        System.out.println(aproxPI(200000));

    }

    public static double aproxPI(int iterations){
        double res = 4;
        double divider = 3;
        boolean isplus = false;
        while (iterations > 0){
            if (isplus){
                res = res + (4 / divider);
                isplus = false;
            }else{
                res = res - (4 / divider);
                isplus = true;
            }
            divider += 2;
            iterations--;

        }

        return res;
    }

}
