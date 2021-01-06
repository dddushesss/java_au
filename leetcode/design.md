#Design
+ [Binary Search Tree Iterator](#binary-search-tree-iterator)
<....>
## Binary Search Tree Iterator
https://leetcode.com/problems/binary-search-tree-iterator
```java
class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack();
        pushLeft(root);
    }

    public int next() {
        TreeNode node = stack.pop();
        if (node.right != null)
            pushLeft(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return stack.size() > 0;
    }

    private void pushLeft(TreeNode root) {
        while (root != null) {
            stack.add(root);
            root = root.left;
        }
    }
}
```