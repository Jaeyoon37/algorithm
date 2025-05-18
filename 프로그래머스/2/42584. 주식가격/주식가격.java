import java.util.Stack;

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int top = stack.pop(); // 갸격이 떨어진 시점
                answer[top] = i-top; // i까지 가격이 유지되었으니까 i-top초 동안 가격 유지
            }
            stack.push(i);
        }
        // 남은 스택 처리
        while (!stack.isEmpty()) {
            int top = stack.pop();
            answer[top] = prices.length -1 -top;
        }
        return answer;
    }
}
