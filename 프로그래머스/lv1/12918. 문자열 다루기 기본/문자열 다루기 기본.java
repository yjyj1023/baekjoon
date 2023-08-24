import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        try{
            Long.parseLong(s);
            if((s.length() == 4 || s.length() == 6)){
                answer = true;
            }else{
                answer = false;
            }
        }catch(Exception e){
            answer = false;
        }
        
        
        return answer;
    }
}