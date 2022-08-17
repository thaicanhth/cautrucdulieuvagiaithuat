package buoi9;

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
    // can method de travesal bat dau tu root
    public void traverseInOrder()
    {
        if (root!=null) {
            root.traverseInOrder(); // Do root la TreeNode neen su dung duoc traverseInOrder() ben trong
            // TreeNode
        }

    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }

    public void traversePostOrder()
    {
        if (root!=null) {
            root.traversePostOrder();
        }
    }

    // Xay dung ham tim kiem, bat dau tu root nha

    public TreeNode get(int value)
    {
        if (root!=null) {
            return root.get(value); //Neu root co ton tai moi di tim duoc
            // day la cay da moc len roi nhe cac ban. Ham get minh chua xay dung thoi
        }
        return null;// Kieu root bang null thi return null
    }

    // Viet ham truot pa te tu root
    public int min()
    {
        // cay ni chua co root, rang ma dung mang lon de truot duoc dung ko
        if (root==null) {
            // nen tra ve 1 so nho nhat, nho de so lam
            return Integer.MIN_VALUE;
        }else{
            return root.min();// Bat dau cuoc hanh trinh
        }
    }

    // Viet ham truot pa te tu root
    public int max()
    {
        // cay ni chua co root, rang ma dung mang lon de truot duoc dung ko
        if (root==null) {
            // nen tra ve 1 so nho nhat, nho de so lam
            return Integer.MAX_VALUE;
        }else{
            return root.max();// Bat dau cuoc hanh trinh
        }
    }
}

