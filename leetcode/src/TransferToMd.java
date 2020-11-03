import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransferToMd {
    String mdLine;
    String sourceLine;
    TransferToMd(String mdLine, String sourceLine){
        this.mdLine=mdLine;
        this.sourceLine=sourceLine;
    }
    public String formatToMd(){
        String[] mdSplitArray = mdLine.split("<....>");
        List<String> oldMdStr = new ArrayList<>(Arrays.asList(mdLine.split("<....>")));
        mdSplitArray[0] = mdSplitArray[0].concat("+ [");
        mdSplitArray[0] = mdSplitArray[0].concat(sourceLine.substring(sourceLine.indexOf(". ") + 2, sourceLine.indexOf(System.lineSeparator())));
        mdSplitArray[0] = mdSplitArray[0].concat("](#");
        mdSplitArray[0] = mdSplitArray[0].concat(sourceLine.substring(sourceLine.indexOf("problems/") + 9,sourceLine.indexOf("/".concat(System.lineSeparator()))));
        mdSplitArray[0] = mdSplitArray[0].concat(")".concat(System.lineSeparator()));
        mdSplitArray[0] = mdSplitArray[0].concat("<....>");
        mdSplitArray[1] = mdSplitArray[1].concat(System.lineSeparator().concat("## "));
        mdSplitArray[1] = mdSplitArray[1].concat(sourceLine.substring(sourceLine.indexOf(". ") + 2, sourceLine.indexOf(System.lineSeparator())));
        mdSplitArray[1] = mdSplitArray[1].concat(System.lineSeparator());
        mdSplitArray[1] = mdSplitArray[1].concat(sourceLine.substring(sourceLine.indexOf("https://"), sourceLine.indexOf("/".concat(System.lineSeparator()))));
        mdSplitArray[1] = mdSplitArray[1].concat(System.lineSeparator());
        mdSplitArray[1] = mdSplitArray[1].concat("```java".concat(System.lineSeparator()));
        mdSplitArray[1] = mdSplitArray[1].concat(sourceLine.substring(sourceLine.indexOf("class Solution")));
        mdSplitArray[1] = mdSplitArray[1].concat(System.lineSeparator().concat("```"));
        return mdSplitArray[0].concat(mdSplitArray[1]);
    }
}