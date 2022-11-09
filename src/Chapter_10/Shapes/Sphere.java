package Chapter_10.Shapes;

public class Sphere extends ThreeDimmensionalShape{

    final String description = "a sphere";
    final double DIAMETER;
    public Sphere(double x ) {

        DIAMETER = x;

    }
    @Override
    String getDescription() {
        return description;
    }
    @Override
    public double getArea() {
        return DIAMETER*Math.PI*Math.pow(DIAMETER,2);
    }

    @Override
    public double getVolume() {
        return (4.0/3.0)*Math.PI * Math.pow(DIAMETER,3);
    }

}
