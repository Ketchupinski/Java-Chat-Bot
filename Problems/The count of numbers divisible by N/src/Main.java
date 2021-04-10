import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        int k = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                k++;
            }
        }
        System.out.println(k);

    }
}