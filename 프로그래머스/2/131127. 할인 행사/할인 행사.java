import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        //want, number 해시맵에 저장
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        //총 일수를 계산할 변수 초기화
        int answer = 0;
        
        //특정일 i에 회원가입 시 할인받을 수 있는 품목 체크
        for(int i=0; i<discount.length - 9; i++) {
            //i일에 회원가입 시 할인받는 제품, 개수를 담을 해시맵
            HashMap<String, Integer> discount10d = new HashMap<>();
            for(int j=i; j<i+10; j++) {
                if (wantMap.containsKey(discount[j])) {
                    discount10d.put(discount[j], discount10d.getOrDefault(discount[j], 0) +1);
                }
            }
            if (discount10d.equals(wantMap)) {
            answer++;
        }
        }
        
        return answer;
    }
}