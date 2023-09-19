class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        
        for(int i = 0; i < str1.length(); i++) {
            answer += str1Char[i];
            answer += str2Char[i];
        }
        
        return answer;
    }
}