import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

    static List<Integer>[] tree;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        tree = new ArrayList[N+1];
        parent = new int[N+1];
        visited = new boolean[N+1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree[a].add(b);
            tree[b].add(a);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }

    }
    static void dfs(int current) {
        visited[current] = true;

        for (int next : tree[current]) {
            if (!visited[next]) {
                parent[next] = current;
                dfs(next);
            }
        }
    }
}

