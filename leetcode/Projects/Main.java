import MDGenerator.TransferToMd;
import MDGenerator.readWrite;

public class Main {

    public static void main(String[] args) {
        readWrite mdGenerator = new readWrite("leetcode/Strings.md","leetcode/leetcode_source.txt");
        TransferToMd proceed = new TransferToMd(mdGenerator.Read('m'),mdGenerator.Read('s'));
        mdGenerator.Write(proceed.formatToMd());
    }
}