import proceedClasses.TransferToMd;
import proceedClasses.readWrite;

public class Main {

    public static void main(String[] args) {
        readWrite mdGenerator = new readWrite("leetcode/graph.md", "leetcode/leetcode_source.txt");
        TransferToMd proceed = new TransferToMd(mdGenerator.Read('m'), mdGenerator.Read('s'));
        mdGenerator.Write(proceed.formatToMd());
    }
}

