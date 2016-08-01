
package actionet;

/**
 *
 * @author calebfrost
 */
public class Square implements Shape {

    //height = width
    private double side;

    public Square(double s) {
        this.side = s;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String getName() {
        return "Square";
    }

}
