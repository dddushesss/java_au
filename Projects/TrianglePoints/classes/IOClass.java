package classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class IOClass {
    public List<String> readInList(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
    public void writeInFile(String filePath, String str) throws IOException {
        Files.writeString(Path.of(filePath),str);
    }
}
