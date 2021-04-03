package homework.chapterfour;

public class Line extends Shape{

    private Point to;

    public Line(Point point, Point to) {
        super(point);
        this.to = to;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        this.to.setX(to.getX() + dx);
        this.to.setY(to.getY() + dy);
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX() + to.getX())/2,
                         (point.getY() + to.getY())/2);
    }

    @Override
    public Line clone () {
        return new Line(new Point(point.getX(), point.getY()), new Point(to.getX(), to.getY()));
    }

    @Override
    public String toString() {
        return "Line{" +
                "to=" + to +
                ", point=" + point +
                '}';
    }
}
