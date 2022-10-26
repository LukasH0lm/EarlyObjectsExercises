package Chapter_5.IntegersDivisibleBy3;

public class Main {
    public static void main(String[] args) {
        System.out.println(integersDivisibleBy3());
    }

    public static int integersDivisibleBy3(){
        int res = 0;
        for(int i = 0; i < 30; i++){
            if (i % 3 == 0){
                res += i;
            }
        }
        return res;

    }

}
