package project_euler;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int num=1, count=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the nth prime number: ");
        int n = sc.nextInt();
        while (count < n){
            num=num+1;
            System.out.println("nums " + num);
            for (i = 2; i <= num; i++){
                if (num % i == 0) {
                    System.out.println("i " + i);
                    break;
                }
            }
            if ( i == num){
                count = count+1;
                System.out.println("count " + count);
            }
        }
        System.out.println("Value of nth prime is: " + num);
    }
}

