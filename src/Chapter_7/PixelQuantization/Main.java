package Chapter_7.PixelQuantization;

public class Main {
    public static void main(String[] args) {
        pixelQuantization();

    }

    public static void pixelQuantization(){
        int[] pixelArray = new int[200];
        for (int value:
             pixelArray) {
            value = (int) (Math.random() * 200);

        }
        int bound = 20;
        int value = 10;
        boolean isInRange = false;
        for (int i = 0; i < pixelArray.length; i++) {

            while (!isInRange) {
                if (i <= bound) {
                    bound += 20;
                    value += 20;
                } else {
                    pixelArray[i] = value;
                    isInRange = true;
                }
            }
        }


        for (int i = 0; i < pixelArray.length; i++) {
            System.out.println("index " + i + "=" + pixelArray[i]);
        }
        
    }
}