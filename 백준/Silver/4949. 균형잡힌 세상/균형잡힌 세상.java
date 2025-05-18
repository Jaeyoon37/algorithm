
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String txt = sc.nextLine();

            Stack<Character> stack = new Stack<>();
            boolean isOK = true;

            if(txt.equals(".")) break; // 입력 종료 조건

            for(int i=0; i<txt.length(); i++) {
                char word = txt.charAt(i);
                if(word == '(' || word == '[') {
                    stack.push(word);
                } else if (word == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isOK = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (word == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isOK = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty()) { //괄호가 남아있으면
                isOK = false;
            }
            System.out.println(isOK ? "yes" : "no");
        }
        sc.close();
    }
}

