package Chapter_7.TurtleGraphics;

public class Main {
    public static void main(String[] args) {
        Turtle myTurtle = new Turtle();

        int[] instructions =
                             {5,2,3,5,2,2,5,2,4,5,4,4,5,2,4,5,4,3,3,5,2,3,5,2,1,
                        4,5,9,4,5,2,3,3,2,5,2,4,5,4,4,5,2,4,5,4,3,3,5,2,3,5,2,1,
        5,2,3,5,7,4,
                              2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,
                               3,5,12,4,

                               2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,
                               2,1,5,1,4,5,1,3,

                               4,5,7
                             };
        myTurtle.run(instructions);


        myTurtle.displayBoard();
    }
}