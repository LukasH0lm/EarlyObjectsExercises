package Chapter_10.Shapes;

public class Tetrahedron extends ThreeDimmensionalShape {

    final String description = "a tetrahedron";
    final double SIDE_LENGTH;

    public Tetrahedron(double x ){

        SIDE_LENGTH = x;

    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    public double getArea()
    {
        return ((SIDE_LENGTH * SIDE_LENGTH /2)*4) + SIDE_LENGTH * SIDE_LENGTH;
    }

    @Override
    public double getVolume() {
        return Math.pow(SIDE_LENGTH,3)/(6*(Math.sqrt(2)));
    }

}
