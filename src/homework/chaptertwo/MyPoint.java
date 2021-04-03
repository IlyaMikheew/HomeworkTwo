package homework.chaptertwo;

public class MyPoint {
    private final double x;
    private final double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint translate (double a, double b) {
        return new MyPoint(x + a, y + b);
    }

    public MyPoint scale (double coeff) {
        return new MyPoint(x * coeff, y * coeff);
    }

}
