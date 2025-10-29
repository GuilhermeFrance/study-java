package OOP.entities;

public class RectangleEntity {
    public double high;
    public double width;

    public double Area() {
        return high * width;
    }

    public double Perimeter() {
        return (2 * high) + (2 * width);
    }

    public double Diagonal() {
        return Math.sqrt((high * high) + (width * width));
    }

}
