import java.util.*;
public class EvenOddMethod {
    static void EvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        EvenOdd(num);
    }
}
