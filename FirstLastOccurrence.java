import java.util.Scanner;
public class FirstLastOccurrence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.next();        
            char digit = sc.next().charAt(0);  
            int first = -1, last = -1;
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == digit) {
                    if (first == -1) first = i + 1; 
                    last = i + 1;
                }
            }
            if (first == -1) {
                System.out.println("Digit not found");
            } else {
                System.out.println("First=" + first + ", Last=" + last);
            }
        }
    }
}
