class Solution {
    public int solution(int n, String control) {
        int answer = 0;

        for(int i = 0; i < control.length(); i++){
            if ('w' == control.charAt(i)) {
                n = n + 1;
            } else if ('s' == control.charAt(i)) {
                n = n - 1;
            } else if ('d' == control.charAt(i)) {
                n = n + 10;
            } else {
                n = n - 10;
            }
        }
        answer = n;

            return answer;
    }
}