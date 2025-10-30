// / Prime numbers within a range
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Use Scanner to take user input for the range
        Scanner scanner = new Scanner(System.in);
        // System. out.println("Enter start and end number for range");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            boolean res = isPrime(i);
            if (res == true) {
                System.out.println(i);
            }
        }
    }
}

// Print all prime numbers in the given range
public static boolean sPrime(int n) {
    if (n == 1) {
        return false;
    } else {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
