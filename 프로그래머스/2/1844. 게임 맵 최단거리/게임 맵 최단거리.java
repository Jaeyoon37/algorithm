import java.util.*;

class Solution {
    //상하좌우 방향을 나타내는 배열 선언
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int n = maps.length; //행 개수
        int m = maps[0].length; //열 개수
        boolean[][] visited = new boolean[n][m]; //방문 여부 기록
        int[][] dist = new int[n][m]; //최단거리
        
        Queue<int[]> queue = new ArrayDeque<>();
        
        queue.add(new int[] {0,0}); //시작점(0,0) 큐에 넣기
        visited[0][0] = true; //시작점 방문 처리로 변경
        dist[0][0] = 1; //시작점 거리 1로 초기화
        
        while (!queue.isEmpty()) {
            int[] now = queue.poll(); //현재 위치 꺼냄
            int curX = now[0]; //현재x좌표
            int curY = now[1]; //현재y좌표
            
            for (int d=0; d<4; d++) {
                int nx = curX + dx[d]; //이동(그 다음 x좌표)
                int ny = curY + dy[d]; //이동(그 다음 y 좌표)
                
                //범위 안에 있고,
                if(nx >= 0 && ny >= 0 && nx < n && ny < m ) {
                    //벽이 아니면서, 아직 방문하지 않았다면
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true; //방문 체크
                        dist[nx][ny] = dist[curX][curY]+1; //현재 칸 거리 +1
                        queue.add(new int[] {nx, ny}); //그다음 탐색 대상으로 큐에 넣기
                    }
                }
            }
        }
        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
}