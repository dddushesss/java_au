package classes;


public class Triangle {
    private final Points a;
    private final Points b;
    private final Points c;

    public Triangle(Points a, Points b, Points c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static double getLength(Points a, Points b) {
        return Math.pow(Math.abs(Math.pow(a.getX(), 2) - Math.pow(b.getX(), 2)), 0.5);
    }

    public boolean isIsosceles() {
        return getLength(a, b) == getLength(b, c) || (getLength(b, c) == getLength(a, c)) || (getLength(a, c) == getLength(a, b));
    }

    public double getS() {
        double p = getLength(a, b) + getLength(a, c) + getLength(b, c);
        double A = getLength(a, b);
        double B = getLength(a, c);
        double C = getLength(b, c);
        return Math.pow(p / 2 * (p-A)*(p-B)*(p-C),0.5);
    }

}
