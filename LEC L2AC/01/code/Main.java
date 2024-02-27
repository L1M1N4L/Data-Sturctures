import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create class and object
        System.out.print("Type something and press Enter: ");

        Scanner input = new Scanner(System.in);
        String b = input.nextLine();

        Languages lang = new Languages(b);

        lang.dogEnglish();
        lang.dogJapanese();
        lang.dogIndonesian();
    }
}