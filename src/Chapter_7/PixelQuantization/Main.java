package Chapter_7.PixelQuantization;

public class Main {
    public static void main(String[] args) {
        pixelQuantization();

    }

    public static void pixelQuantization(){
        int[] pixelArray = new int[200];
        int bound = 20;
        int value = 10;
        for (int i = 0; i < pixelArray.length; i++) {

            if (!(i <= bound)){
                bound += 20;
                value += 20;
            }
            pixelArray[i] = value;

        }


        for (int i = 0; i < pixelArray.length; i++) {
            System.out.println("index " + i + "=" + pixelArray[i]);
        }

    }
}
