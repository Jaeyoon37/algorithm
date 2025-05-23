import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> que = new ArrayDeque<>();

        for(int i=1; i<=N; i++){
            que.add(i);
        }

        while (que.size()>1) {
            que.poll();
            que.add(que.poll());
        }

        System.out.println(que.peek());

    }
}

