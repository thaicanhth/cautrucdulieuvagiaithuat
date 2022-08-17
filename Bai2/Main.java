package Bai2;

public class Main {
    public static void decToOctal(int k) {
        MyStack s = new MyStack(20);
        System.out.print(k + " in Octal system is: ");
        while (k > 0) {
            s.push(new Integer(k % 8));
            k = k / 8;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        decToOctal(10); // He 8: 0-7
        System.out.println();
    }
}
