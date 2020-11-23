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
        triangles.sort(Triangle.SquareComparator);
        return triangles.get(0).toString();

    }
}
