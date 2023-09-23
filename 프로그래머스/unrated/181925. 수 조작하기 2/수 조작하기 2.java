class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for(int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i-1];
            if (1 == diff) {
                answer += "w";
            } else if (-1 == diff) {
                answer += "s";
            } else if (10 == diff) {
                answer += "d";
            } else {
                answer += "a";
            }
        }

        return answer;
    }
}