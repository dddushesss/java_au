import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import classes.Points;
import classes.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getSquare() {
        Triangle triangle = createTriangle();
        double p;
        double A = triangle.getLength(triangle.getA(), triangle.getB());
        double B = triangle.getLength(triangle.getA(), triangle.getC());
        double C = triangle.getLength(triangle.getB(), triangle.getC());
        p = (A + B + C)/2;
        double s = Math.sqrt(p * (p - A) * (p - B) * (p - C));
        assertEquals(s, triangle.getSquare());
    }

    @Test
    void isIsosceles() {
        Triangle triangle = createTriangle();
        double A = triangle.getLength(triangle.getA(), triangle.getB());
        double B = triangle.getLength(triangle.getA(), triangle.getC());
        double C = triangle.getLength(triangle.getB(), triangle.getC());
        assertEquals(A == B || B == C || C == A, triangle.isIsosceles());
    }

    @Test
    void isTriangle() {
        Triangle triangle = createTriangle();
        double A = triangle.getLength(triangle.getA(), triangle.getB());
        double B = triangle.getLength(triangle.getA(), triangle.getC());
        double C = triangle.getLength(triangle.getB(), triangle.getC());
        assertEquals(A < B + C
                && B < A + C
                && C < A + B, triangle.isTriangle());
    }

    private Triangle createTriangle() {

        return new Triangle(new Points(1 + Math.random()*10, 1 + Math.random()*10),
                new Points(1 + Math.random()*10, 1 + Math.random()*10),
                new Points(1 + Math.random()*10, 1 + Math.random()*10));

    }
}