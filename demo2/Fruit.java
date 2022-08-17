package demo2;

public class Fruit {
    private int code;
    private String name;
    private String orgin;
    private double price;

    public Fruit(){
    }

    public Fruit(int code, String name, String orgin, double price) {
        this.code = code;
        this.name = name;
        this.orgin = orgin;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgin() {
        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", orgin='" + orgin + '\'' +
                ", price=" + price +
                '}';
    }
}
