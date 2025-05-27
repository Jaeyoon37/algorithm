import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        //중복제거
        HashSet<Integer> set = new HashSet<>();
        
        for(int monster : nums) {
            set.add(monster);
        }
        
        int 선택수 = nums.length / 2;
        int 종류수 = set.size();
        
        return Math.min(선택수,종류수);
    }
}