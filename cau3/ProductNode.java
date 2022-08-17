package cau3;

public class ProductNode  {
    private Product product;
    private ProductNode next;

    public ProductNode(){
    }

    public ProductNode(Product product) {
        this.product = product;
    }

    public ProductNode(Product product, ProductNode next) {
        this.product = product;
        this.next = next;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductNode getNext() {
        return next;
    }

    public void setNext(ProductNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ProductNode{" +
                "product=" + product +
                ", next=" + next +
                '}';
    }
}
