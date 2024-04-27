package MAQ;

import java.util.*;

class palindrome {

    static public boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean result = isPalindrome(num);
        if (result) {
            System.out.println("The entered number is palindrome");
        } else {
            System.out.println("The entered number is not palindrome");
        }
        scanner.close();
    }
}