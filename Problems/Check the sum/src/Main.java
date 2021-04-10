import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        scan.close();
        boolean check = first + second == 20 ||
                        second + third == 20 ||
                        first + third == 20;
        System.out.println(check);
    }
}