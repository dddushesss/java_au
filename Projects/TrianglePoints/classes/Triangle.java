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

    @Override
    public String toString() {
        return "A(" + getA().getX() + ' '
                + getA().getY() + ") "
                + "B(" + getB().getX() + ' '
                + getB().getY() + ") "
                + "C(" + getC().getX() + " "
                + getC().getY() + ") "
                + "S = " + getSquare() + '\n';
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

    public double getLength(Points a, Points b) {
        return Math.pow(Math.abs(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)), 0.5);
    }

    public static Comparator<Triangle> SquareComparator = new Comparator<Triangle>(){

        @Override
        public int compare(Triangle o1, Triangle o2) {
            if(o1.getSquare() > o2.getSquare()){
                return -1;
            }
            else if(o1.getSquare()< o2.getSquare()){
                return 1;
            }
            else return 0;
        }
    };
    public boolean isIsosceles() {
        return getLength(a, b) == getLength(b, c) || (getLength(b, c) == getLength(a, c)) || (getLength(a, c) == getLength(a, b));
    }

    public boolean isTriangle() {
        return getLength(a, b) < getLength(b, c) + getLength(a, c)
                && getLength(b, c) < getLength(a, b) + getLength(a, c)
                && getLength(a, c) < getLength(a, b) + getLength(b, c);
    }

    public double getSquare() {
        double A = getLength(a, b);
        double B = getLength(a, c);
        double C = getLength(b, c);
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }

}
