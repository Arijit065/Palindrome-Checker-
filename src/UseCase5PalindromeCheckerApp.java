import java.util.Stack;
import java.util.Scanner;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String originalStr = scanner.nextLine();

        // Create a Stack that holds Characters
        Stack<Character> stack = new Stack<>();

        // 1. Push Operation: Insert each character of the string into the stack
        for (int i = 0; i < originalStr.length(); i++) {
            stack.push(originalStr.charAt(i));
        }

        // 2. Pop Operation: Remove characters from the stack to build the reversed string
        String reversedStr = "";
        while (!stack.isEmpty()) {
            reversedStr = reversedStr + stack.pop();
        }

        // 3. Compare and Print Result
        if (originalStr.equals(reversedStr)) {
            System.out.println("Result: '" + originalStr + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + originalStr + "' is NOT a Palindrome.");
        }

        scanner.close();
    }
}