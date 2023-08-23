class Solution {
    public static void swap(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        
        for(int i = 0; i < answer.length-1; i++){
            int min = i;
            for(int j = i+1; j < answer.length; j++){
                if(answer[min].charAt(n) > answer[j].charAt(n)){
                    min = j;
                }
                else if(answer[min].charAt(n) == answer[j].charAt(n)){
                    if(answer[min].compareTo(answer[j]) > 0){
                        swap(answer, min, j);
                    }
                }
            }
            swap(answer, i, min);
        }
        return answer;
    }
}