class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] arr2 = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int x = 0;
        
        for(int i = 0; i < a-1; i++){
            x += arr[i];
        }
        
        x += b;
        
        answer = arr2[x % 7];
    
        
        return answer;
    }
}