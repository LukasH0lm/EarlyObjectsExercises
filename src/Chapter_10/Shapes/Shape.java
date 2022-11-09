package Chapter_10.Shapes;

public abstract class Shape {

    String description = "generic shape";

    String getDescription() {
         return description;
    }

    public double getArea()
    {
        return 0;
    }

    public double getVolume() {
        return 0;
    }

}
