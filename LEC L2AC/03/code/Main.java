public class Main {
    public static void main(String[] args) {
        // 1 - constant
        int a = 1; // 1x
        a++; // 1x
        System.out.println("Number = " + a); // 1x

        // n - linear
        int n = 100;
        for(int b = 1; b<=n; b++){
            System.out.println("Iteration "+ b); // 100x
        }

        // n^2 - quadratic
        int counter = 1;
        for(int c = 1; c<=n; c++){ // f(n) = n^2 + n; O(n^2)
            for(int d=1; d<=n; d++){
                System.out.print(counter++ + " "); // n = 100 -> 10.000x
            }
            System.out.println(""); // n = 100 -> 100x
        }

        // guess it -> log(n) - logarithmic
        // n = 10 -> 3x; n = 50 -> 5x
        // n = 100 -> 6x; n = 1000 -> 9x
        n = 10;
        counter = 1;
        while(n > 1){ // f(n) = 2 log(n); O(log(n))
            n=n/2; // 3x
            System.out.print(counter++ + " "); // 3x
        }
    }
}