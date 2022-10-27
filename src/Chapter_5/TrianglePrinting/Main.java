package Chapter_5.TrianglePrinting;

public class Main {
    public static void main(String[] args) {

        trianglePrinting(horizontalOrientation.LEFT,verticalOrientation.UP);
        trianglePrinting(horizontalOrientation.LEFT,verticalOrientation.DOWN);
        trianglePrinting(horizontalOrientation.RIGHT,verticalOrientation.DOWN);
        trianglePrinting(horizontalOrientation.RIGHT,verticalOrientation.UP);


    }

    enum horizontalOrientation {
        LEFT,
        RIGHT
    };

    enum verticalOrientation {
        UP,
        DOWN
    };



    public static void trianglePrinting(horizontalOrientation hOrientation, verticalOrientation vOrientation){
        int length = 10;
        System.out.println("_".repeat(10));
        for(int i = 1; i <= length; i++){
            if (hOrientation == horizontalOrientation.LEFT){
                if (vOrientation == verticalOrientation.UP){
                    System.out.println("*".repeat(i));
                }else{
                    System.out.println("*".repeat(11 - i));

                }
            }else{
                if (vOrientation == verticalOrientation.DOWN){
                    System.out.println(" ".repeat(i - 1) + "*".repeat(10 - i));
                }else{
                    System.out.println(" ".repeat(10 - i) + "*".repeat(i));
                }
            }


        }
        System.out.println("_".repeat(10));

    }

}
