import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int count = 0;

        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isGoodWord = true;

            for(char c : str.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            if(stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        
    }
}