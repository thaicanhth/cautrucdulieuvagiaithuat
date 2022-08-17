package buoi08;

public class Tree {
    private TreeNode root;

    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void insert(int value)
    {
        if (root==null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }

    }
    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
}
