package classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class maxIsoscelesTriangleS {
    public List<Triangle> fillTriangles(String filePath) throws IOException {
        IOClass s = new IOClass();
        List<Triangle> triangles;
        int a;


        triangles = s.readInList(filePath)
                .stream()
                .map(points -> points.replaceAll("\\s+"," "))
                .filter(points -> points.length() - points.replaceAll(" ", "").length() == 5)
                .map(point -> point.split(" ")).map(TriangleString -> new Triangle(new Points(TriangleString[0] + ' ' + TriangleString[1]),
                        new Points(TriangleString[2] + ' ' + TriangleString[3]),
                        new Points(TriangleString[4] + ' ' + TriangleString[5])))
                .filter(Triangle::isIsosceles)
                .collect(Collectors.toList());
        return triangles;
    }

    public double getmaxisIsoscelesTriangleS(List<Triangle> triangles) {
        if (triangles.size() > 0) {
            List<Double> trianglesS = triangles.stream()
                    .map(Triangle::getS)
                    .collect(Collectors.toList());
            return Collections.max(trianglesS);
        } else return -1;
    }
}
