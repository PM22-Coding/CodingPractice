package project_euler;

public class Even_Fibonacci_numbers {
    public static void main(String[] args) {
        Integer a = null;
        Integer b = null;
        Integer sum = null;
        for (int i = 1; b == null || b <= 4000000 ; i++) {
            if (i == 1) {
                a = 1;
                System.out.println(a);
            } else if (i == 2) {
                b = 2;
                sum = 2;
                System.out.println(b);
            } else {
                int c = a + b;
                a = b;
                b = c;

                if (b % 2 == 0) {
                    sum = sum + b;
                }
                System.out.println(c);
            }
        }
        System.out.println(sum);
    }
}
