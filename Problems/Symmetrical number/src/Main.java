import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt(); // 3773

        int h1 = num / 1000; // 3
        int h2 = (num / 100) % 10; // 7
        int h3 = (num / 10) % 10; // 7
        int h4 = num % 10; // 3

        if (h1 == h4 && h2 == h3) {
            System.out.println(1);
        } else {
            System.out.println(1488);
        }
    }
}