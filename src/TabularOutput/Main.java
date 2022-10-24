package TabularOutput;

public class Main {
    public static void main(String[] args) {
        tabularOutput(5);
    }

    public static void tabularOutput(int number){
        System.out.println("n  n1  n2  n3  ");
        for(int i = 1;i <= number; i++){

            System.out.println(i + "  " + i*i + "  " + i*i*i + "  " + i*i*i*i);

        }

    }


}
