import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Deque<Integer> answer = new ArrayDeque<>();
        int n = progresses.length;
        int[] daysLeft = new int [n];

        for(int i=0; i<n; i++){
            // 배포 가능일 계산
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        int count = 0; //현재 묶음에 들어갈 작업 수
        int maxDay = daysLeft[0]; //현재까지 배포 기준이 되는 가장 늦은 날짜

        for(int i=0; i<n; i++) {
            if (daysLeft[i] <= maxDay) {
                count++;
            } else {
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }
        answer.add(count);

        //Deque(answer) 를 Stream으로 변환, Integer -> int , int[]배열로 변환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
