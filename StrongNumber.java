import java.util.Scanner;
public class StrongNumber {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();    
            int original = n;
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += factorial(digit);  
                n /= 10;
            }
            if (sum == original) {
                System.out.println("Strong Number");
            } else {
                System.out.println("Not Strong Number");
            }
        }
    }
}
