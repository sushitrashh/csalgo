
import java.util.Scanner;

public class Lab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();;
        System.out.print("sum " + Sum(num) + " ");

    }

    static int Sum(int value) {
        if (value > 0) {
            return value + Sum(value - 1);
        } else {
            return 0;
        }

    }
}
