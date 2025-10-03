import java.util.Scanner;
public class SumOfEvenDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();  
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}