import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        int[] prev = new int[n];
        int[] next = new int[n];

        // 초기설정
        for (int i = 0; i < n; i++) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }
        next[n - 1] = -1; // 마지막 행은 다음 없음!

        Stack<Integer> removed = new Stack<>(); // 삭제된 행 저장(복구용)

        for (String command : cmd) {
            String[] parts = command.split(" ");
            char c = parts[0].charAt(0);

            if (c == 'U') {
                int x = Integer.parseInt(parts[1]);
                for (int i = 0; i < x; i++) {
                    k = prev[k];
                }
            } else if (c == 'D') {
                int x = Integer.parseInt(parts[1]);
                for (int i = 0; i < x; i++) {
                    k = next[k];
                }
            } else if (c == 'C') {
                removed.push(k);
                // 연결 끊기
                if (prev[k] != -1) next[prev[k]] = next[k];
                if (next[k] != -1) prev[next[k]] = prev[k];
                // 커서 이동
                k = (next[k] != -1) ? next[k] : prev[k];
            } else if (c == 'Z') {
                int r = removed.pop();
                // 연결 복원
                if (prev[r] != -1) next[prev[r]] = r;
                if (next[r] != -1) prev[next[r]] = r;
            }
        }

        // 최종 결과 만들기
        StringBuilder sb = new StringBuilder();
        boolean[] alive = new boolean[n];
        Arrays.fill(alive, true);
        while (!removed.isEmpty()) {
            alive[removed.pop()] = false;
        }

        for (int i = 0; i < n; i++) {
            sb.append(alive[i] ? 'O' : 'X');
        }

        return sb.toString();
    }
}