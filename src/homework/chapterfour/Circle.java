package homework.chapterfour;

public class Circle extends Shape implements Cloneable{
    private double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    public Circle clone(){
        return new Circle(new Point(point.getX(), point.getY()), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", point=" + point +
                '}';
    }
}
