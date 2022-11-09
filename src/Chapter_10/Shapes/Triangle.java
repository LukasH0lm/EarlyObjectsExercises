package Chapter_10.Shapes;

public class Triangle extends TwoDimmensionalShape{

    final String description = "a triangle";
    final double SIDE_LENGTH;
    public Triangle(double x ) {
        SIDE_LENGTH = x;
    }
    @Override
    String getDescription() {
        return description;
    }

    @Override
    public double getArea() {
        return (SIDE_LENGTH * SIDE_LENGTH)/2;
    }

}
