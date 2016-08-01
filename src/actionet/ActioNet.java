
package actionet;

/**
 *
 * @author calebfrost
 */
public class ActioNet {

    public static void main(String[] args) {

        //circle
        Shape shape = new Circle(10);

        System.out.println("Type=" + shape.getName());
        System.out.println("Area=" + shape.getArea());
        System.out.println("Perimeter=" + shape.getPerimeter());

        //rectangle
        shape = new Rectangle(5, 10);

        System.out.println("Type=" + shape.getName());
        System.out.println("Area=" + shape.getArea());
        System.out.println("Perimeter=" + shape.getPerimeter());

        //triangle
        shape = new Triangle(5, 10);

        System.out.println("Type=" + shape.getName());
        System.out.println("Area=" + shape.getArea());
        System.out.println("Perimeter=" + shape.getPerimeter());

        //square
        shape = new Square(8);

        System.out.println("Type=" + shape.getName());
        System.out.println("Area=" + shape.getArea());
        System.out.println("Perimeter=" + shape.getPerimeter());

    }
}
