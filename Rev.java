import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        isPalindrome(str);
    }

    public static void isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(reversedStr);
    }
}
