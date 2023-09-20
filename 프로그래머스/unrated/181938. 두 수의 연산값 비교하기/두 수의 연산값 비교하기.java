class Solution {
    public int solution(int a, int b) {
        int ab2 = 0; 
        int abValue = 0;
        String ab = String.valueOf(a) + String.valueOf(b);
        
        abValue = Integer.parseInt(ab);
        ab2 = 2 * a * b;
        if(abValue < ab2)
            return ab2;
        else
            return abValue;
    }
}