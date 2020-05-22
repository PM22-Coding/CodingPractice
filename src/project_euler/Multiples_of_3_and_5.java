package project_euler;

public class Multiples_of_3_and_5 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
