package classes;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class maxIsoscelesTriangleS {
    public List<Triangle> fillTriangles(String filePath) throws IOException {
        IOClass s = new IOClass();
        return s.readInList(filePath)
                .stream()
                .filter(points -> points.length() - points.replaceAll(" ", "").length() == 5)
                .map(point -> point.split(" ")).map(TriangleString ->
                        new Triangle(
                                new Points(TriangleString[0] + ' ' + TriangleString[1]),
                                new Points(TriangleString[2] + ' ' + TriangleString[3]),
                                new Points(TriangleString[4] + ' ' + TriangleString[5])
                        )
                )
                .filter(Triangle::isIsosceles)
                .collect(Collectors.toList());
    }


    public double getmaxisIsoscelesTriangleS(List<Triangle> triangles) {
        if (triangles.size() > 0) {
            List<Double> trianglesS = triangles.stream()
                    .filter(Triangle::isIsosceles)
                    .map(Triangle::getS)
                    .collect(Collectors.toList());
            return Collections.max(trianglesS);
        } else return -1;
    }
}
