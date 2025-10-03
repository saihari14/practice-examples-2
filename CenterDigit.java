import java.util.Scanner;
public class CenterDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.next();   
            int len = n.length();
            if (len % 2 == 0) {
                System.out.println(-1);  
            } else {
                int midIndex = len / 2;  
                System.out.println(n.charAt(midIndex));
            }
        }
    }
}
