import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i=1; i<=N; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            for (int i=0; i<K-1; i++) {
                deque.addLast(deque.pollFirst());
            }
            sb.append(deque.pollFirst()).append(", ");
        }
        sb.append(deque.pollFirst());

        System.out.println("<" + sb.toString() + ">");
    }
}

