public class TransferToMd {

    String mdLine;
    String sourceLine;
    TransferToMd(String mdLine, String sourceLine){
        this.mdLine=mdLine;
        this.sourceLine=sourceLine;
    }
    public String formatToMd(){
        String[] mdSplitArray = mdLine.split("<....>");
        mdSplitArray[0] = mdSplitArray[0].concat("+ [");
        mdSplitArray[0] = mdSplitArray[0].concat(sourceLine.substring(sourceLine.indexOf(". ") + 2, sourceLine.indexOf('\n')-1));
        mdSplitArray[0] = mdSplitArray[0].concat("](#");
        mdSplitArray[0] = mdSplitArray[0].concat(sourceLine.substring(sourceLine.indexOf("problems/") + 9,sourceLine.indexOf("/\r\n")));
        mdSplitArray[0] = mdSplitArray[0].concat(")\n");
        mdSplitArray[0] = mdSplitArray[0].concat("<....>");
        mdSplitArray[1] = mdSplitArray[1].concat("## ");
        mdSplitArray[1] = mdSplitArray[1].concat(sourceLine.substring(sourceLine.indexOf(". ") + 2, sourceLine.indexOf('\n')));
        mdSplitArray[1] = mdSplitArray[1].concat("\n");
        mdSplitArray[1] = mdSplitArray[1].concat(sourceLine.substring(sourceLine.indexOf("https://"), sourceLine.indexOf("/\r\n") + 1));
        mdSplitArray[1] = mdSplitArray[1].concat("\n```java\n");
        mdSplitArray[1] = mdSplitArray[1].concat(sourceLine.substring(sourceLine.indexOf("class Solution")));
        mdSplitArray[1] = mdSplitArray[1].concat("\n```\n");
        return mdSplitArray[0].concat(mdSplitArray[1]);

    }
}