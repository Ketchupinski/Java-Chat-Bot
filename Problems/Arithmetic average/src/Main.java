import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        scan.close();
        double k = 0;
        double d = 0;
        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                k++;
                d += i;
            }
        }
        double x = d / k;
        System.out.println(x);
    }
}