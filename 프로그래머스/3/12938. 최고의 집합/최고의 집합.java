import java.util.Arrays;

class Solution {
    //숫자들이 비슷할 수록 곱이 커짐.
    //s를 n으로 최대한 똑같이 나누기
    public int[] solution(int n, int s) {
        if (s < n) return new int[]{-1};
        
        int[] answer = new int[n];
        
        int a = s / n; //기본 숫자
        int b = s % n; //남는 나머지
        
        Arrays.fill(answer, a); //기본 숫자로 채우기
        
        for (int i=0; i < b; i++) {
            answer[i]++;
        }
        Arrays.sort(answer);
        return answer;
    }
}