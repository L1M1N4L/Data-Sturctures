public class Exercise2_1Answer {
    public static void main(String[] args)
    {
        long a = 6;
        int i = (int)a;
        //i = i * (int)a;  //using explicit cast
        i *= a; // using Java compound assignment operator
        System.out.println(i);
    }
}
