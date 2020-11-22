import classes.IOClass;
import classes.maxIsoscelesTriangleS;

import java.io.IOException;

class TrianglePoints {
    public static void main(String[] args) throws IOException {
        maxIsoscelesTriangleS triangleS = new maxIsoscelesTriangleS();
        IOClass IO = new IOClass();
        IO.writeInFile("Projects/TrianglePoints/testResults",triangleS.getmaxIsoscelesTriangleS(triangleS.fillTriangles("Projects/TrianglePoints/test")));
    }
}
