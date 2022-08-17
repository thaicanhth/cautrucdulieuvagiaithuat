package buoi9;

public class TreeNode {
    private int data;//data la gia tri cua TreeNode dang dung nha
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode(int data, TreeNode leftChild, TreeNode rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void insert(int value) {
        // neu data == node root thi ko insert
        if (data == value) {
            return;
        }
        // Neu value nho hon root (data) ben trai
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }

        } else {// Neu value lon hon root (data) ben phai
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }

        }

    }

    // Bay gio xay dung traverseInOrder
    // Left Root Right
    public void traverseInOrder() {
        // Mo toi left child truoc, Kieu la di lan luot cho den khi gap 1 left child ko null
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        // sau do vist node nay
        System.out.print("data = " + data + ",");
        // Sau do visit the right child
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    // Tuong tu, minh se ap dung ly thuyet de cai dat 2 Traversal con lai
    // PreOrder: Root Left Right
    public void traversePreOrder() {

        System.out.print(data + ", ");

        if (leftChild != null) {
            leftChild.traversePreOrder();
        }

        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }

    // Post Order la Left Right Root
    public void traversePostOrder() {
        if (leftChild != null) {
            leftChild.traversePreOrder();
        }
        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
        System.out.print(data + ", ");
    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        // Khong bang thi truot qua trai
        if (value < data) {
            // Ma luc ni phai kiem tra left child co ton tai khong moi truot duoc
            // ma vua truot vua di tim
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {// Bat dau qua phai
            if (rightChild != null) {
                return rightChild.get(value);
            }

        }

        // Khong tim ra thi song doi FA
        return null;

    }

    public int min() {
        // left child cua node dang đứng nè
        if (leftChild == null) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.max();
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" + "data=" + data + ", leftChild=" + leftChild + ", rightChild=" + rightChild + '}';
    }

}

