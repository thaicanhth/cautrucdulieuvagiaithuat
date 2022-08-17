package cau3;

import java.util.ArrayList;
import java.util.List;

public class ProductLinkedList {
    private ProductNode head = null;
    private int size = 0;

    public ProductLinkedList() {
    }

    public void addFirst(Product product) {
        ProductNode newNode = new ProductNode(product);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    // viết hàm xóa tư Front
    public ProductNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        ProductNode removedNode = head;
        head = head.getNext();
        size--;// xóa
        return removedNode;
    }

    // viết hàm hiển thị danh sách mặt hàng ở câu a
    public void printList() {
        ProductNode current = head;
        System.out.println("HEAD -> ");
        while (current != null) {
            System.out.println("" + current.getProduct());
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    // viết hàm trả về số lượng các phần tử trong danh sách
    public int numberOfProducts() {
        return size;
    }

    // viết hàm tiếm kiếm Product dựa trên tên nhập vào
    // trả về la danh sánh các Product nên sẽ khai báo
    public List<Product> searchByName(String nameSearch) {
        List<Product> listOfProducts = new ArrayList<>();
        // duyệt các phần tử trong linked list
        ProductNode current = head;
        Product product = new Product();
        while (current != null) {
            //mõi phan tư ss tên
            product = current.getProduct();
            if (product.getName().contains(nameSearch)) {
                listOfProducts.add(product);
            }
            current = current.getNext();//duyêt từng phần tử
        }
        return listOfProducts;
    }
    // viết hàm sap xép các phân tư theo thứ từ giảm đến tăng

    public void bubbleSortByPrice() {
        //chot cac vị trí node head và index
        //cùng với Product tại 2 vị trí trên
        ProductNode current = head, index = null;
        Product currentProduct, indexProduct;
        if (head == null) {
            return;
        } else {
            // duyệt để sap xep
            while (current != null) {
                index = current.getNext();// lay pt bên cạnh current
                //duyệt hết các phần tử còn lại
                while (index != null) {
                    if (current.getProduct().getPrice() <index.getProduct().getPrice()) {
                        //sap xep data
                        currentProduct = current.getProduct();
                        indexProduct = index.getProduct();
                        //swap day
                        current.setProduct(indexProduct);
                        index.setProduct(currentProduct);
                    }
                    //di chuyển các pt
                    index = index.getNext();
                }


                current = current.getNext(); // duyệt các phần tử
            }
        }
        System.out.printf("Bubble Sorted: ");
        printList();
    }

    public ProductNode getHead() {
        return head;
    }

    public void setHead(ProductNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
