package OnTapThi.Cau1;

public class Node {
    private int number;
    private Node next = null;

    public Node() {
    }

    public Node(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "number=" + number + ", next=" + next + '}';
    }
}
