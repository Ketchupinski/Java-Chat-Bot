import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String replaceWord = word.replace("a", "b");
        System.out.println(replaceWord);
    }
}