import classes.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TrianglePoints {
    public static void main(String[] args) throws IOException {
        IOclass s = new IOclass();
        List<Triangle> triangles = new ArrayList<>();
        List<String> ss = s.readInList("Projects/TrianglePoints/test")
                .stream()
                .filter(points -> points.length() - points.replaceAll(" ", "").length() == 5)
                .collect(Collectors.toList());
        for (String point : ss) {
            String[] TriangleString = point.split(" ");
            triangles.add(new Triangle(new Points(TriangleString[0] + ' ' + TriangleString[1]),
                    new Points(TriangleString[2] + ' ' + TriangleString[3]),
                    new Points(TriangleString[4] + ' ' + TriangleString[5])));
        }
        triangles = triangles.stream()
                .filter(Triangle::isIsosceles)
                .collect(Collectors.toList());
    }
}
