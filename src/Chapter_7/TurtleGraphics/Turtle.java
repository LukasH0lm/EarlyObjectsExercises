package Chapter_7.TurtleGraphics;

import java.util.Arrays;

public class Turtle {

    int[] position = {0,0};
    enum direction {
        RIGHT,
        DOWN,
        LEFT,
        UP
    }

    direction currentDirection;
    

    direction[][][] board = new direction[20][20][4];
    char[][] charboard = new char[20][20];
    boolean isPenDown = false;
    boolean isExiting = false;
    boolean isShowingStep = false;
    boolean hasTurned = false;
    direction previousTurn = direction.RIGHT;
    int[] previousPosition = {0,0};
    public Turtle(){
        this.position[0] = 0;
        this.position[1] = 0;
        this.currentDirection = direction.RIGHT;

    }

    public void run(int[] instructions){

        step(instructions);



    }


    public void move(int[] spaces){
        if (spaces[0] != 0){
            int spacesLeft = spaces[0];

            System.out.println("beginning movement");
            System.out.println("moves left: " + spacesLeft);
            System.out.println("direction : " + this.currentDirection);

            try{
                while(spacesLeft > 0){
                    draw();
                    if (currentDirection == direction.UP){
                        position[1] -= 1;
                    }

                    if (currentDirection == direction.RIGHT){
                        position[0] += 1;
                    }

                    if (currentDirection == direction.DOWN){
                        position[1] += 1;
                    }

                    if (currentDirection == direction.LEFT){
                        position[0] -= 1;
                    }

                    draw();
                    hasTurned = false;
                    spacesLeft--;
                    System.out.println("current position: x: " + position[0] +" y: " + position[1]);
                    System.out.println("moves left after move: " + spacesLeft);



                    if (isShowingStep){

                        draw();
                    }
            }
        }   catch (IndexOutOfBoundsException e){

            System.out.println("ERROR: move amount too large");
            System.out.println("Reseting Turtle position to (0,0)");


            }
        }
    }

    public void draw(){

        if (isPenDown) {

            //draw

            /*
            if (!hasTurned){
                if (currentDirection == direction.LEFT || currentDirection == direction.RIGHT ){
                    charBoard[position[0]] ;
                }else{
                    board[position[1]][position[0]] = '│';
                }
            }else{
                board[position[1]][position[0]] = '┓';
            }*/

        }

    }

    public void step(int[] instructions) {

        if(!isExiting){

            for (int i = 0; i < instructions.length; i++){
                System.out.println("step: " + i);
                System.out.println("current instruction: " + instructions[i]);
                System.out.println("instruction lenght: " + instructions.length);
                if (instructions[i] == 5 && i + 1 < instructions.length){
                    doAction(instructions[i],instructions[i+1]);
                    i++;
                }else {
                    doAction(instructions[i]);
                }
            }
        }
    }


    public void displayBoard(){
        for (direction[][] board:
                board) {
            System.out.println();
            for (direction[] tile:
                    board) {
                if (Arrays.asList(tile).contains(direction.UP)){
                    if (Arrays.asList(tile).contains(direction.RIGHT)){
                        if (Arrays.asList(tile).contains(direction.DOWN)){
                            if (Arrays.asList(tile).contains(direction.LEFT)){
                                System.out.print('╀');
                            }else{
                                System.out.print('├');

                            }
                        } else if (Arrays.asList(tile).contains(direction.LEFT)) {
                            System.out.print('┴');
                        } else{
                            System.out.print('┕');
                        }
                    }else if(Arrays.asList(tile).contains(direction.DOWN)){
                        if(Arrays.asList(tile).contains(direction.LEFT)){
                            System.out.print('┥');
                        }else {
                            System.out.print('│');
                        }

                    } else if (Arrays.asList(tile).contains(direction.LEFT)) {
                        System.out.print('┘');

                    }
                    //hvis den ikke har direction.UP
                } else if (Arrays.asList(tile).contains(direction.RIGHT)) {
                    if (Arrays.asList(tile).contains(direction.DOWN)){
                        if (Arrays.asList(tile).contains(direction.LEFT)){
                            System.out.print('┳');

                        }else{
                            System.out.print('┏');
                        }
                    }

                }

                System.out.print(tile);

            }

        }
    }


    public void doAction(int instruction, int... argument){
        switch (instruction){
            case 1 -> isPenDown = false;
            case 2 -> {isPenDown = true; draw();}
            case 3 -> turnRight();
            case 4 -> turnLeft();
            case 5 -> move(argument);
            case 6 -> displayBoard();
            case 9 -> isExiting = true;
        }
        if (isPenDown){
            draw();
        }
    }





    public void turnLeft(){
        previousTurn = currentDirection;
        if (currentDirection == direction.UP){
            currentDirection = direction.LEFT;
        }
        else if (currentDirection == direction.RIGHT){
            currentDirection = direction.UP;
        }
        else if (currentDirection == direction.DOWN){
            currentDirection = direction.RIGHT;
        }
        else if (currentDirection == direction.LEFT){
            currentDirection = direction.DOWN;
        }
        hasTurned = true;

    }

    public void turnRight(){
        previousTurn = currentDirection;

        if (currentDirection == direction.UP){
            currentDirection = direction.RIGHT;
        }
        else if (currentDirection == direction.RIGHT){
            currentDirection = direction.DOWN;
        }
        else if (currentDirection == direction.DOWN){
            currentDirection = direction.LEFT;
        }
        else if (currentDirection == direction.LEFT){
            currentDirection = direction.UP;
        }
        hasTurned = true;

    }
    //nakket fra geeksforgeeks
    public static int[] addX(int n, int arr[], int x)
    {
        int i;

        // create a new array of size n+1
        int[] newarr = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }



}
