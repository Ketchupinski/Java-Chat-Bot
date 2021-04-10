import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wordOne = scan.nextLine();
        String wordTwo = scan.nextLine();
        scan.close();
        String rWordOne = wordOne.replace(" ", "");
        String rWordTwo = wordTwo.replace(" ", "");
        boolean check = rWordOne.equals(rWordTwo);
        System.out.println(check);
    }
}