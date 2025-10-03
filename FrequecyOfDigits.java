
import java.util.Scanner;
public class FrequecyOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.next();  
            int[] freq = new int[10];  
            for (int i = 0; i < n.length(); i++) {
                char c = n.charAt(i);
                freq[c - '0']++;
            }
            for (int i = 0; i <= 9; i++) {
                if (freq[i] > 0) {
                    System.out.print(i + "→" + freq[i] + ", ");
                }
            }
        }
    }
}
