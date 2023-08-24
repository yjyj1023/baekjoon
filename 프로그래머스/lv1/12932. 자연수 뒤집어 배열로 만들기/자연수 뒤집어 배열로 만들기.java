import java.util.*;

class Solution {
    public Long[] solution(long n) {
        Long[] answer = new Long[Long.toString(n).length()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = n%10;
            n = n/10;
        }
        return answer;
    }
}