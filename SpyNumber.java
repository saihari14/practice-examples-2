import java.util.Scanner;
public class SpyNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();   
            int sum = 0, product = 1, temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp = temp / 10;
            }
            if (sum == product) {
                System.out.println("Spy Number");
            } else {
                System.out.println("Not Spy Number");
            }
        }
    }
}
