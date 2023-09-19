class Solution {
    public int solution(int num1, int num2) {
        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
            return num1 % num2;
        } else {
            throw new IllegalArgumentException("제한사항을 만족하지 않습니다.");
        }
    }
}