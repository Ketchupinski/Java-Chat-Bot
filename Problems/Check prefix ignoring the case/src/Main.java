import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String uCase = word.toUpperCase();
        boolean check = uCase.startsWith("J");
        System.out.println(check);
    }
}