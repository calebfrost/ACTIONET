
package actionet;

/**
 *
 * @author calebfrost
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
