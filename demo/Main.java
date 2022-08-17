package demo;

public class Main {
    private static int K;

    public static void decToBin(int k){
        MyStack s = new MyStack(20);
        System.out.printf(k + "in binary system is: ");
        while (k > 0){
            s.push(new Integer(k % 2));
             k = k / 2;
        }
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println();
    }
    public static void decToOctal(int k) {
        MyStack s = new MyStack(20);
        System.out.printf(k + "in Octal system is: ");
        while (k > 0){
            s.push(k % 8);
            k = k / 8;
        }
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println();
    }
    public static void decToHex(int k){
        String digits = "0123456789ABCDEF";
        MyStack s = new MyStack(20);
        System.out.printf(k + "in Hexa system is: ");
        while (k > 0){
            int digit = K % 16;
            s.push(digits.charAt(digit));
             k = k / 16;
        }
        while (!s.isEmpty()){
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        decToBin(30);
        decToBin(7);
        decToBin(10);
        System.out.println();
    }
}













