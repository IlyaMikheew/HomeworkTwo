package homework.chapterfour;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone () {
        return new Rectangle(new Point(point.getX(), point.getY()), width, height);
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width/2, point.getY() + height/2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", point=" + point +
                '}';
    }
}
