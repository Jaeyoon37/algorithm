import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bfs(N);
        System.out.println(visited[K] - 1);
    }

    static void bfs (int n) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);
        visited[n] = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : new int[] {now - 1, now + 1, now * 2}) {
                if (next >= 0 && next <100001 && visited[next] == 0) {
                    visited[next] = visited[now] + 1;
                    queue.add(next);
                }
            }
        }
    }

}

