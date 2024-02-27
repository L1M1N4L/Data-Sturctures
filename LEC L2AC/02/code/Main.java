import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int asciiVal;
        char chr;

        System.out.print("Enter a character: ");
        Scanner scn = new Scanner(System.in);
        chr = scn.next().charAt(0);

        asciiVal = chr;
        System.out.println("ASCII value of " +chr+ " is: "+asciiVal);

        System.out.println("Unicode: \u0041\u005F\u002A");

        int z = 3;
        System.out.println(z++);
        System.out.println(z);

        z = 3;
        System.out.println(++z);
        System.out.println(z);

        String x = "aBCDe";
        System.out.println(x.length());
        System.out.println(x.charAt(3));
        System.out.println(x.toLowerCase());
    }
}