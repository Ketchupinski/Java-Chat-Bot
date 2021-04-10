import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int tensOne = num % 100;
        int hung = (num - tensOne) / 100;
        int last = num % 10;
        int tensTwo = (tensOne - last) / 10;
        System.out.println(tensTwo + hung + last);
    }
}