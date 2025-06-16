import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; //상하(위, 아래, 0, 0)
    static int[] dy = {0, 0, -1, 1}; //좌우(0, 0, 좌, 우)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    int area = bfs(i, j);
                    count++;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(count);
        System.out.println(maxArea);

    }

    private static int bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {i, j});
        visited[i][j] = true;
        int area = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int curX = now[0];
            int curY = now[1];

            for (int d = 0; d < 4; d++) {
                int nx = curX + dx[d];
                int ny = curY + dy[d];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        queue.add(new int[] {nx, ny});
                        area++;
                        visited[nx][ny] = true;
                    }
                }
            }
        }

       return area;
    }

}

