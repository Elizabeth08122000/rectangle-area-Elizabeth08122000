import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double summ = Math.floor((Math.abs(x2-x1)*Math.abs(y2-y1))*100)/100;
        System.out.println(summ);
        in.close();
    }
}
