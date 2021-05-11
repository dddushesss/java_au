package proceedClasses;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class readWrite {
    static String mdPath;
    static String sourcePath;

    public readWrite(String mdPath, String sourcePath) {
        readWrite.mdPath = mdPath;
        readWrite.sourcePath = sourcePath;
    }


    public String Read(char file) {
        String line = "";
        if (file == 's')
            try (Scanner scanner = new Scanner(Paths.get(sourcePath), StandardCharsets.UTF_8.name())) {
                line = scanner.useDelimiter("\\A").next();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        else if (file == 'm')
            try (Scanner scanner = new Scanner(Paths.get(mdPath), StandardCharsets.UTF_8.name())) {
                line = scanner.useDelimiter("\\A").next();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        return line;
    }

    public void Write(String Line) {
        File fileStreamW = new File(mdPath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(fileStreamW);
            fr.write(Line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fr != null;
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
