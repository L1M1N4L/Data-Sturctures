import java.util.Scanner;

public class Exercise2_2Answer {

    public static String encrypt(String text) {
        int len = text.length();
        text = text.toLowerCase();
        String returned = "";
        //Read first letter
        char c = text.charAt(0);
        returned+=c; // returned = returned + c;

        returned+=text.charAt(2); // char no 3
        returned+=text.charAt(1); // char no 2

        int skipValue;

        for(int i =3;i<len;i++){
            skipValue = (int)text.charAt(i-1) - 96;
            //System.out.println(skipValue);
            //System.out.println("text.charAt = " + (int)text.charAt(i));

            //System.out.println("Result of skipValue + ASCII char = " + (skipValue + (int)text.charAt(i)));

            if((skipValue + (int)text.charAt(i)) > 122)
            {
                skipValue = (skipValue + (int)text.charAt(i))-122;
                returned+=((char)(skipValue + 96));
            }
            else{
                returned+=((char)(skipValue + (int)text.charAt(i)));
            }

        }

        return returned;
    }

    public static void main(String[] args)
    {
        int validate = 0; // length
        String b=""; // the input
        System.out.println("Welcome to Detective Encrypt Program");

        while(validate < 5) {
            System.out.println("Type something >= 5 chars and press Enter: ");

            Scanner input = new Scanner(System.in);
            b = input.nextLine();

            validate = b.length();
        }

        if(validate >= 5){
            System.out.println(encrypt(b));
        }

    }
}
