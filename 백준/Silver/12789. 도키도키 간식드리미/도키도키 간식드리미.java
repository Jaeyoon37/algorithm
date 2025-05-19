import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> line = new ArrayDeque<>(); //원래 줄
        Stack<Integer> stack = new Stack<>(); //보조 줄

        for(int i=0; i<N; i++){
            line.add(Integer.parseInt(st.nextToken()));
        }

        int num = 1; //간식 받을 번호

        while (!line.isEmpty()) {
            if (line.peek() == num) {
                line.poll(); //간식받고
                num++; //다음 번호
            } else if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop(); //보조줄에서 pop
                num++; //다음 번호
            } else {
                stack.push(line.poll()); //원래줄에서 꺼내서 보조줄에 넣기
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == num) {
                stack.pop();
                num++;
            } else {
                break;
            }
        }

        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}

