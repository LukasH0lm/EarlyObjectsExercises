package Chapter_10.Shapes;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        Triangle triangle = new Triangle(6);
        Circle circle = new Circle(7);

        Cube cube = new Cube(8);
        Tetrahedron tetrahedron = new Tetrahedron(10);
        Sphere sphere = new Sphere(9);

        Shape[] shapes = {square, triangle, circle, cube, tetrahedron, sphere};

        for (Shape shape:
             shapes) {

            System.out.println(("description: " + shape.getDescription()));
            System.out.println("area: " + shape.getArea());

            if (shape.getClass().getSuperclass() == ThreeDimmensionalShape.class){
                System.out.println("volume: " + shape.getVolume());
            }

            System.out.println();

        }

    }
}