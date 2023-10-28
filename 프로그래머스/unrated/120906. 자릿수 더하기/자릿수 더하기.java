class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n);
        
        for(int i = 0; i < a.length(); i++){
            answer += Integer.parseInt(a.substring(i, i + 1));
        }
        return answer;
    }
}