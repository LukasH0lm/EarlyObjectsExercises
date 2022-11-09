package Chapter_10.Shapes;

public class Cube extends ThreeDimmensionalShape {

    final String description = "a cube";
    final double SIDE_LENGTH;
    public Cube(double x ) {
        SIDE_LENGTH = x;
    }
    @Override
    String getDescription() {
        return description;
    }

    @Override
    public double getArea() {
        return SIDE_LENGTH*SIDE_LENGTH*6;
    }

    @Override
    public double getVolume() {
        return Math.pow(SIDE_LENGTH,3);
    }

}
