import java.util.Scanner;
public class SwapFirstLastDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.next(); 
            if (n.length() == 1) {
                System.out.println(n);  
                return;
            }
            char[] arr = n.toCharArray();
            char temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;

            System.out.println(String.valueOf(arr));
        }
    }
}
