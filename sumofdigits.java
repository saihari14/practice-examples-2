import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n); 
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  
            n /= 10;       
        }
        System.out.println(sum);
        sc.close();
    }}