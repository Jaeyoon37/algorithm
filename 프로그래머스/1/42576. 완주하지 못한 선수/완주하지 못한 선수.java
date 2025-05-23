import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for (String name : completion) {
            //해당 이름이 이미 있으면 기존값+1, 없으면 0+1
            hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
        }
        for (String name : participant) {
            //완주 기록이 없거나 개수가 0이면 완주하지 못한 사람으로 간주
            if (!hashMap.containsKey(name) || hashMap.get(name) == 0) {
                return name;
            }
            hashMap.put(name, hashMap.get(name)-1);
        }
        
        return "";
    }
}