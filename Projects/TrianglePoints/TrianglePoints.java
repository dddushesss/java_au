import classes.IOClass;
import classes.maxIsoscelesTriangleS;

import java.io.IOException;

public class TrianglePoints {
    public static void main(String[] args) throws IOException {
        maxIsoscelesTriangleS triangleS = new maxIsoscelesTriangleS();
        IOClass IO = new IOClass();
        IO.writeInFile(args[1],triangleS.getmaxIsoscelesTriangleS(triangleS.fillTriangles(args[0])));
    }
}
