package OnTapThi.Cau15;

public class Main {
    public static double sum(int n){
        if(n==1){
            return 1;
        }else{
            return (double)1/n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(7));
    }
}
