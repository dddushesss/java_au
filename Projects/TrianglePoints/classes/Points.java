package classes;


public class Points {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Points(String points) {
        this.x = valueOf(points).getX();
        this.y = valueOf(points).getY();
    }

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private static int numOfPoints = 2;

    private Points valueOf(String points) {
        String a = points.split(" ")[0];
        String b = points.strip().split(" ")[1];
        return new Points(Double.parseDouble(a), Double.parseDouble(b));
    }


}
