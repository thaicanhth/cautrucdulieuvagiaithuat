package cau3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Product p01 = new Product("Book Java", 39.9, 10);
    Product p02 = new Product("Book C#", 12.3, 5);
    Product p03 = new Product("Book PhP", 9, 2);
    Product p04 = new Product("Advanced Java", 49.9, 10);
    ProductLinkedList list = new ProductLinkedList();
    System.out.println(""+ list.isEmpty());
    list.addFirst(p01);
    list.addFirst(p02);
    list.addFirst(p03);
    list.addFirst(p04);
    System.out.println(""+ list.numberOfProducts());
    list.printList();
    // viết hàm tiềm kiếm
        List<Product> listOfProduct = new ArrayList<>();
        listOfProduct = list.searchByName("Java");
        System.out.println(""+ listOfProduct);
        //list.removeFromFront(); có thể xóa nếu muốn
        // chu là viết hàm sap xép theo price
        System.out.println("=======");
        list.bubbleSortByPrice();

    }
}

