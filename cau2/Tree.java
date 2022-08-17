package cau2;

public class Tree {
    private TreeNode root;
    public void insert(char value){
        if (root == null){
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
    public void insertAll(char[] myValues) {
        root = new TreeNode(myValues[0]);
        for (char i = 1; i < myValues.length; i++){
            root.insert(myValues[i]);
        }
    }
    public TreeNode get(char value){
        if (root != null){
            return root.get(value);
        }
        return null;
    }
    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }
    public void traversePreOrder(){
        if (root != null){
            root.traversePreOrder();
        }
    }
    public char min(){
        if (root == null){
            return Character.MIN_VALUE;
        } else {
            return root.min();
        }
    }
    public char max() {
        if (root == null){
            return Character.MIN_VALUE;
        } else {
            return root.max();
        }
    }
    public TreeNode binarySearch(TreeNode root, char value){
        {
        if (root == null){
            return (null);
        }
        if (root.getData() == value){
            return root;
        }
        if (value < root.getData()){
            return (binarySearch(root.getLeftChild(), value));
        } else {
            return (binarySearch(root.getRightChild(), value));
        }
    }
}
public int countNode(TreeNode root){
    if (root == null) {
        return 0;
    }
    return 1 + countNode(root.getLeftChild()) + countNode(root.getRightChild());
    }
    public TreeNode getRoot() {
        return root;
    }
    public void setRoot(TreeNode root){
        this.root = root;
    }
}

















