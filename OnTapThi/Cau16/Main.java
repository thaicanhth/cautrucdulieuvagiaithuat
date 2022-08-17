package OnTapThi.Cau16;

public class Main {
    public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = 10;
 
        System.out.println("Giai thua cua " + a + " la: "
                + Main.tinhGiaithua(a));
        System.out.println("Giai thua cua " + b + " la: "
                + Main.tinhGiaithua(b));
        System.out.println("Giai thua cua " + c + " la: "
                + Main.tinhGiaithua(c));
    }
}
