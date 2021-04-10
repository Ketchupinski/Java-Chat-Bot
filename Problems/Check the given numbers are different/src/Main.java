import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h1 = scan.nextInt();
        int h2 = scan.nextInt();
        int h3 = scan.nextInt();
        scan.close();
        boolean check = h1 != h2 && h2 != h3 && h1 != h3;
        System.out.println(check);
    }
}