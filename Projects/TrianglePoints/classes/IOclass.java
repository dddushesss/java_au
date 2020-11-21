package classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class IOclass {
    public List<String> readInList(String filePath) throws IOException {
        List<String> dataList = Files.readAllLines(Paths.get(filePath));
        return dataList;
    }
}
