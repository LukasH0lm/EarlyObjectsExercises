package Chapter_10.Shapes;

public class Circle extends TwoDimmensionalShape {

    final String description = "a circle";
    final double DIAMETER;
    public Circle(double x ) {
        DIAMETER = x;
    }

    @Override
    String getDescription() {
        return description;
    }
    @Override
    public double getArea() {
        return DIAMETER*Math.PI;
    }

}
