
package actionet;

/**
 *
 * @author calebfrost
 */
public class Triangle implements Shape {

    private double width;
    private double height;

    public Triangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public double getArea() {
        return .5 * this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 0;
        //cannot determine perimateer of a triangle without knowing additional
        //geometry or characteristics(to determine additional geometry)
        //e.g. if its a right triangle
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
