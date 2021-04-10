import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        scan.close();
        int firstClass = first / 2 + first % 2;
        int secondClass = second / 2 + second % 2;
        int thirdClass = third / 2 + third % 2;
        System.out.println(firstClass + secondClass + thirdClass);
    }
}