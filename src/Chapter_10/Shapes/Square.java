package Chapter_10.Shapes;

public class Square extends TwoDimmensionalShape {

    final String description = "a square";

    final double SIDE_LENGTH;
    public Square(double x) {
        SIDE_LENGTH = x;
    }
@Override
    String getDescription() {
        return description;
    }

    @Override
    public double getArea() {
        return SIDE_LENGTH * SIDE_LENGTH;
    }

}
