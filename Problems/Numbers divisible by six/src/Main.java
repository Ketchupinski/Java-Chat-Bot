import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num % 6 == 0) {
                k += num;
            }
        }
        scan.close();
        System.out.println(k);
    }
}