package classes;


import java.util.Comparator;

public class Triangle {
    private final Points a;
    private final Points b;
    private final Points c;

    public Triangle(Points a, Points b, Points c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSquare() {
        return getS();
    }

    public Points getA() {
        return a;
    }

    public Points getB() {
        return b;
    }

    public Points getC() {
        return c;
    }

    private static double getLength(Points a, Points b) {
        return Math.pow(Math.abs(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)), 0.5);
    }

    public static Comparator<Triangle> SquareComparator = Comparator.comparingDouble(Triangle::getSquare);

    public boolean isIsosceles() {
        return getLength(a, b) == getLength(b, c) || (getLength(b, c) == getLength(a, c)) || (getLength(a, c) == getLength(a, b));
    }

    public boolean isTriangle() {
        return getLength(a, b) < getLength(b, c) + getLength(a, c)
                && getLength(b, c) < getLength(a, b) + getLength(a, c)
                && getLength(a, c) < getLength(a, b) + getLength(b, c);
    }

    private double getS() {
        double p = getLength(a, b) + getLength(a, c) + getLength(b, c);
        double A = getLength(a, b);
        double B = getLength(a, c);
        double C = getLength(b, c);
        return Math.pow(p / 2 * (p - A) * (p - B) * (p - C), 0.5);
    }

}
