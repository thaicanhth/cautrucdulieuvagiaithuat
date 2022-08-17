package cau2;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'A', 'D', 'E', 'G', 'L', 'M', 'T', 'W'};
        Tree tree = new Tree();
        tree.insertAll(arr);
        System.out.println("Root: "+ tree.getRoot().getData());
        tree.traverseInOrder();
        System.out.println("");
        System.out.println("Max: "+ tree.max());
        System.out.println("Min: "+ tree.min());
        System.out.println("Number of nodes: "+ tree.countNode(tree.getRoot()));
        System.out.println(""+ tree.binarySearch(tree.getRoot(), 'A'));
    }
}
