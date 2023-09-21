class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if (">".equals(ineq) && "=".equals(eq)) {
            if (n >= m)
                return 1;
            else
                return 0;
        } else if (">".equals(ineq) && "!".equals(eq)) {
            if (n > m)
                return 1;
            else
                return 0;
        } else if ("<".equals(ineq) && "=".equals(eq)) {
            if (n <= m)
                return 1;
            else
                return 0;
        }            
        else if ("<".equals(ineq) && "!".equals(eq)) {
            if (n < m)
                return 1;
            else
                return 0;
        }
        return answer;
    }
}