package OnTapThi.Cau10;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int x = 3;
        int y = 1;
        s.clear();
        s.push(5);
        s.push(7);
        s.pop();
        x += y;
        s.pop();
        s.push(x);
        s.push(y);
        s.push(2);
        s.pop();
        s.pop();
        while (! s.isEmpty())
        {
        y = s.pop();
        System.out.println(y);
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
