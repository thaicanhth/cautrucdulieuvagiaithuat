package OnTapThi.Cau1;

public class LinkedList {
    private Node head = null;
    private int size = 0;

    public LinkedList() {
    }
    
    public void addFirst(int x) {
        // create the new Node
        Node newNode = new Node(x);
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    
    public Node removeFirst() {
        if (isEmpty())
        {
            return null;
        }
        Node removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNumber(-1);
        return removeNode;
    }
    public void printList() {
        Node current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {

            System.out.println("" + current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public int count() {
        return size;
    }
    public boolean isEmpty() {
        return head == null;
    }
}
