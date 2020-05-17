import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double a = Math.abs(x2 - x1);
        double b = Math.abs(y2 - y1);
        System.out.println(a * b);
        System.out.println(Float.MAX_VALUE);
    }
}
