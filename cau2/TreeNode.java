package cau2;

public class TreeNode {
    private char data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    public TreeNode(char data) {
        this.data = data;
    }
    public void insert(char value){
        if (value == data){
            return;
        }
        if (value < data){
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null){
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }
    public void traverseInOrder(){
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.println(data + ", ");
        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }
    public TreeNode get(char value){
        if (value==data){
            return this;
        }
        if (value< data){
            if (leftChild != null){
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null){
                return rightChild.get(value);
            }
        }
        return null;
    }
    public void traversePreOrder(){
        System.out.println(data + ", ");
        if (leftChild != null){
            leftChild.traversePreOrder();
        }
        if (rightChild != null){
            rightChild.traversePreOrder();
        }
    }
    public char min(){
        if (leftChild == null){
            return data;
        } else {
            return leftChild.min();
        }
    }
    public char max(){
        if (rightChild == null){
            return data;
        } else {
            return rightChild.max();
        }
    }
    public void traversePostOrder(){
        if (leftChild != null){
            leftChild.traversePostOrder();
        }
        if (rightChild != null){
            rightChild.traversePostOrder();
        }
        System.out.println(data + ", ");
    }
    public char getData(){
        return data;
    }
    public TreeNode getLeftChild(){
        return leftChild;
    }
    public void setLeftChild(TreeNode leftChild){
        this.leftChild = leftChild;
    }
    public TreeNode getRightChild(){
        return rightChild;
    }
    public void setRightChild(TreeNode rightChild){
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}

















