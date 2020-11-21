import classes.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class TrianglePoints {
    public static void main(String[] args) throws IOException {
        maxIsoscelesTriangleS triangleS = new maxIsoscelesTriangleS();
        System.out.println(triangleS.getmaxisIsoscelesTriangleS(triangleS.fillTriangles("Projects/TrianglePoints/test")));
    }
}
