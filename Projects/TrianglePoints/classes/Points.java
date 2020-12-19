package classes;


public class Points {
    private final double x;
    private final double y;

    public Points(String points) {
        this.x = valueOf(points).getX();
        this.y = valueOf(points).getY();
    }

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private Points valueOf(String points) {
        String a = points.split(" ")[0];
        String b = points.strip().split(" ")[1];
        return new Points(Double.parseDouble(a), Double.parseDouble(b));
    }


}
