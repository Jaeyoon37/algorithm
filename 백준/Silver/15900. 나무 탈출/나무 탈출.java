import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    static List<Integer>[] tree;
    static boolean[] visited;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        tree = new ArrayList[N+1];
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

        dfs(1, 0);

        if (result % 2 == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    static void dfs(int node, int depth) {
        visited[node] = true;

        boolean isLeaf = true;

        for (int next : tree[node]) {
            if (!visited[next]) {
                isLeaf = false;
                dfs(next, depth + 1);
            }
        }
        if (isLeaf) result += depth;
    }

}

