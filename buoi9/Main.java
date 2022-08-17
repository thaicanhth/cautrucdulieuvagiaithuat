package buoi9;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
//        TreeNode root = new TreeNode(99);
//        System.out.println("Before: " + root);
//        TreeNode node1 = new TreeNode(64);
//        TreeNode node2 = new TreeNode(123);
//        TreeNode node3 = new TreeNode(56);
//        TreeNode node4 = new TreeNode(789);
//        root.setLeftChild(node1);
//        root.setRightChild(node2);
//        node1.setLeftChild(node3);
//        node2.setRightChild(node4);
//        System.out.println("After: " + root);
//        System.out.println("NOde 2: " + node2);
//        System.out.println("Node 1: " + node1);
        // Day la bai toan tao Cay bang thu cong
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.traverseInOrder();
        System.out.println("");

        tree.traversePostOrder();
        System.out.println("");

        tree.traversePreOrder();
        System.out.println("");
        TreeNode findNode = tree.get(11126);
        if (findNode!=null) {
            System.out.println("Found:  "+ findNode);
        } else {
            System.out.println("Not found");
        }
        // Xem xet vi rang luc null thi ko ghi ra duoc
        // Coi video de biet cach fix nha

        // goi nhe
        System.out.println(""+tree.min());
        System.out.println(""+tree.max());

    }
}
