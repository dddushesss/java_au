package classes;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class maxIsoscelesTriangleS {
    public List<Triangle> fillTriangles(String filePath) throws IOException {
        IOClass s = new IOClass();
        return s.readInList(filePath)
                .stream()
                .map(points -> points.replaceAll("\\s+", " "))
                .filter(points -> points.length() - points.replaceAll(" ", "").length() == 5)
                .map(point -> point.split(" ")).map(TriangleString -> new Triangle(new Points(TriangleString[0] + ' ' + TriangleString[1]),
                        new Points(TriangleString[2] + ' ' + TriangleString[3]),
                        new Points(TriangleString[4] + ' ' + TriangleString[5])))
                .filter(Triangle::isIsosceles)
                .filter(Triangle::isTriangle)
                .collect(Collectors.toList());
    }

    public String getmaxIsoscelesTriangleS(List<Triangle> triangles) {
        if (triangles.size() > 0) {
            triangles.sort(Triangle.SquareComparator);
            return "A(" + triangles.get(0).getA().getX() + ' '
                    + triangles.get(0).getA().getY() + ") "
                    + "B(" + triangles.get(0).getB().getX() + ' '
                    + triangles.get(0).getB().getY() + ") "
                    + "C(" + triangles.get(0).getC().getX() + " "
                    + triangles.get(0).getC().getY() + ") "
                    + "S = " + triangles.get(0).getSquare();
        } else return "Нет треугольников, подходящих под условие задачи";
    }

}
