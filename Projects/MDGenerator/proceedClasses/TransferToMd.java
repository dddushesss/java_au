package proceedClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransferToMd {
    String mdLine;
    String sourceLine;

    public TransferToMd(String mdLine, String sourceLine) {
        this.mdLine = mdLine;
        this.sourceLine = sourceLine;
    }

    public String formatToMd() {
        List<String> oldMdStr = new ArrayList<>(Arrays.asList(mdLine.split("<....>")));
        oldMdStr.add(1, "+ [" + sourceLine.substring(sourceLine.indexOf(". ") + 2, sourceLine.indexOf(System.lineSeparator()))
                + "](#" + sourceLine.substring(sourceLine.indexOf("problems/") + 9, sourceLine.indexOf("/".concat(System.lineSeparator())))
                + ")" + System.lineSeparator() + "<....>");
        oldMdStr.add(System.lineSeparator() + "## " + sourceLine.substring(sourceLine.indexOf(". ") + 2, sourceLine.indexOf(System.lineSeparator()))
                + System.lineSeparator() + sourceLine.substring(sourceLine.indexOf("https://"), sourceLine.indexOf("/" + System.lineSeparator()))
                + System.lineSeparator() + "```java" + System.lineSeparator()
                + sourceLine.substring(sourceLine.contains("class Solution") ?
                sourceLine.indexOf("class Solution"):
                sourceLine.contains("class ") ?
                sourceLine.indexOf("class "):sourceLine.indexOf("public "))
                + System.lineSeparator() + "```");
        return oldMdStr.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}