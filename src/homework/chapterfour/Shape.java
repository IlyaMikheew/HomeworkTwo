package homework.chapterfour;

public abstract class Shape {

    protected Point point = new Point(0 , 0);

    public Shape(Point point) {
        this.point.setX(point.getX());
        this.point.setY(point.getY());
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    public abstract Point getCenter();
}
